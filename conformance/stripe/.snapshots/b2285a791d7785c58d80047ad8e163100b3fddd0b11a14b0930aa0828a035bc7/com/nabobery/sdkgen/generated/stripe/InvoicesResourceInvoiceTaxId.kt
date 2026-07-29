package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoices_resource_invoice_tax_id
 */
@Serializable(with = InvoicesResourceInvoiceTaxId.Serializer::class)
public class InvoicesResourceInvoiceTaxId(
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
  public val type: InlineInvoicesResourceInvoiceTaxIdTypeX9c19b6f6,
  /**
   * The value of the tax ID.
   */
  public val `value`: String? = null,
) {
  public class Builder {
    private var typeValue: InlineInvoicesResourceInvoiceTaxIdTypeX9c19b6f6? = null

    public var type: InlineInvoicesResourceInvoiceTaxIdTypeX9c19b6f6
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * The value of the tax ID.
     */
    public var `value`: String? = null

    public fun build(): InvoicesResourceInvoiceTaxId {
      check(typeValue != null) { "type is required" }
      return InvoicesResourceInvoiceTaxId(
        type = type,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InvoicesResourceInvoiceTaxId = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InvoicesResourceInvoiceTaxId> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InvoicesResourceInvoiceTaxId {
      val jsonDecoder = decoder.requireJsonDecoder("InvoicesResourceInvoiceTaxId")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InvoicesResourceInvoiceTaxId must be a JSON object")
      val type = json.decodeRequired<InlineInvoicesResourceInvoiceTaxIdTypeX9c19b6f6>(rawObject, "type")
      return InvoicesResourceInvoiceTaxId(
        type = type,
        value = rawObject["value"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InvoicesResourceInvoiceTaxId) {
      val jsonEncoder = encoder.requireJsonEncoder("InvoicesResourceInvoiceTaxId")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.value?.let { put("value", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun invoicesResourceInvoiceTaxId(block: InvoicesResourceInvoiceTaxId.Builder.() -> Unit): InvoicesResourceInvoiceTaxId = InvoicesResourceInvoiceTaxId.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InvoicesResourceInvoiceTaxId is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
