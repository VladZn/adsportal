INSERT INTO public.categories (id, name) VALUES ('2d5ad9a8-9583-4cb4-b511-80b0e43d24ef', 'cars');
INSERT INTO public.categories (id, name) VALUES ('6c711310-92ea-471e-bacf-d00fe4a838a0', 'computers');

INSERT INTO public.companies (id, name, description, address) VALUES ('29f834e0-6174-41da-8144-3335246c6c70', 'Company', 'description of the company', 'Moscow');

INSERT INTO public.ads (id, name, content, phone_num, company_id, category_id) VALUES ('be03755c-7870-499d-835d-7482aeeafeb7', 'Ad', 'This is an ad', '+79161234567', '29f834e0-6174-41da-8144-3335246c6c70', '2d5ad9a8-9583-4cb4-b511-80b0e43d24ef');