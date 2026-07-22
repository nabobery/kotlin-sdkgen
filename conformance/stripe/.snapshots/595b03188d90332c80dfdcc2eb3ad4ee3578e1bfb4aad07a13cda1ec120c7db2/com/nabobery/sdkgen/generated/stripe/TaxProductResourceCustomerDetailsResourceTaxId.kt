package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_product_resource_customer_details_resource_tax_id
 */
@Serializable(with = TaxProductResourceCustomerDetailsResourceTaxId.Serializer::class)
public class TaxProductResourceCustomerDetailsResourceTaxId(
    /**
     * The type of the tax ID, one of `ad_nrt`, `ar_cuit`, `eu_vat`, `bo_tin`, `br_cnpj`, `br_cpf`, `cn_tin`, `co_nit`,
     * `cr_tin`, `do_rcn`, `ec_ruc`, `eu_oss_vat`, `hr_oib`, `pe_ruc`, `ro_tin`, `rs_pib`, `sv_nit`, `uy_ruc`, `ve_rif`,
     * `vn_tin`, `gb_vat`, `nz_gst`, `au_abn`, `au_arn`, `in_gst`, `no_vat`, `no_voec`, `za_vat`, `ch_vat`, `mx_rfc`,
     * `sg_uen`, `ru_inn`, `ru_kpp`, `ca_bn`, `hk_br`, `es_cif`, `pl_nip`, `it_cf`, `fo_vat`, `gi_tin`, `py_ruc`,
     * `tw_vat`, `th_vat`, `jp_cn`, `jp_rn`, `jp_trn`, `li_uid`, `li_vat`, `lk_vat`, `my_itn`, `us_ein`, `kr_brn`,
     * `ca_qst`, `ca_gst_hst`, `ca_pst_bc`, `ca_pst_mb`, `ca_pst_sk`, `my_sst`, `sg_gst`, `ae_trn`, `cl_tin`, `sa_vat`,
     * `id_npwp`, `my_frp`, `il_vat`, `ge_vat`, `ua_vat`, `is_vat`, `bg_uic`, `hu_tin`, `si_tin`, `ke_pin`, `tr_tin`,
     * `eg_tin`, `ph_tin`, `al_tin`, `bh_vat`, `kz_bin`, `ng_tin`, `om_vat`, `de_stn`, `ch_uid`, `tz_vat`, `uz_vat`,
     * `uz_tin`, `md_vat`, `ma_vat`, `by_tin`, `ao_tin`, `bs_tin`, `bb_tin`, `cd_nif`, `mr_nif`, `me_pib`, `zw_tin`,
     * `ba_tin`, `gn_nif`, `mk_vat`, `sr_fin`, `sn_ninea`, `am_tin`, `np_pan`, `tj_tin`, `ug_tin`, `zm_tin`, `kh_tin`,
     * `aw_tin`, `az_tin`, `bd_bin`, `bj_ifu`, `et_tin`, `kg_tin`, `la_tin`, `cm_niu`, `cv_nif`, `bf_ifu`, or `unknown`
     */
    public val type: InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d,
    /**
     * The value of the tax ID.
     */
    public val `value`: String,
) {
    public class Builder {
        private var typeValue: InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d? = null

        public var type: InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        private var valueValue: String? = null

        public var `value`: String
            get() = requireNotNull(valueValue) { "value is required" }
            set(`value`) {
                valueValue = value
            }

        public fun build(): TaxProductResourceCustomerDetailsResourceTaxId {
            check(typeValue != null) { "type is required" }
            check(valueValue != null) { "value is required" }
            return TaxProductResourceCustomerDetailsResourceTaxId(
                type = type,
                value = value,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): TaxProductResourceCustomerDetailsResourceTaxId =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TaxProductResourceCustomerDetailsResourceTaxId> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TaxProductResourceCustomerDetailsResourceTaxId {
            val jsonDecoder = decoder.requireJsonDecoder("TaxProductResourceCustomerDetailsResourceTaxId")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "TaxProductResourceCustomerDetailsResourceTaxId must be a JSON object",
                    )
            val type =
                json.decodeRequired<InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d>(
                    rawObject,
                    "type",
                )
            val value = json.decodeRequired<String>(rawObject, "value")
            return TaxProductResourceCustomerDetailsResourceTaxId(
                type = type,
                value = value,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: TaxProductResourceCustomerDetailsResourceTaxId,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("TaxProductResourceCustomerDetailsResourceTaxId")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("type", json.encodeToJsonElement(value.type))
                    put("value", value.value)
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun taxProductResourceCustomerDetailsResourceTaxId(
    block: TaxProductResourceCustomerDetailsResourceTaxId.Builder.() -> Unit,
): TaxProductResourceCustomerDetailsResourceTaxId = TaxProductResourceCustomerDetailsResourceTaxId.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "TaxProductResourceCustomerDetailsResourceTaxId is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
