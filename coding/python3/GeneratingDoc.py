import pandas as pd;
from docxtpl import DocxTemplate;
from docx2pdf import convert;

TEMPLATE = 'test_templated.docx';

def save_quote(quote_id):
    context = {
        'created': '18 Jan 2019',
        'status': 'Work in Progress',
        'clientName': 'AMAZON EUROPE CORE S.A.R.L',
        'clientAddress': '38, AVENUE JOHN F. KENNEDY L-1855 LUXEMBOURG',
        'clientVAT': 'LU2645342523',
        'description': 'Some work to create some stuff',
        'quote': '$1,000.00'
    }
    doc = DocxTemplate(TEMPLATE);
    doc.render(context)
    doc.save(f'quote_{quote_id}.docx')
    convert(f'quote_{quote_id}.docx', f'quote_{quote_id}.pdf')


if __name__ == '__main__':
    save_quote(1);
