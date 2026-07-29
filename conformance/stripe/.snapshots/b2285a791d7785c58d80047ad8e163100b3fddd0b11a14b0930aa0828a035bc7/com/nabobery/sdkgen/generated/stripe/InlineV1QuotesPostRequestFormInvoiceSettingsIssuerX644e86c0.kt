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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/invoice_settings/properties/issuer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/invoice_settings/properties/issuer
 */
@Serializable(with = InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX644e86c0.Serializer::class)
public class InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX644e86c0(
  public val type: InlineV1QuotesPostRequestFormInvoiceSettingsIssuerTypeX9d61a5e5,
  public val account: String? = null,
) {
  public class Builder {
    private var typeValue: InlineV1QuotesPostRequestFormInvoiceSettingsIssuerTypeX9d61a5e5? = null

    public var type: InlineV1QuotesPostRequestFormInvoiceSettingsIssuerTypeX9d61a5e5
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var account: String? = null

    public fun build(): InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX644e86c0 {
      check(typeValue != null) { "type is required" }
      return InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX644e86c0(
        type = type,
        account = account,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX644e86c0 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX644e86c0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX644e86c0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX644e86c0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX644e86c0 must be a JSON object")
      val type = json.decodeRequired<InlineV1QuotesPostRequestFormInvoiceSettingsIssuerTypeX9d61a5e5>(rawObject, "type")
      return InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX644e86c0(
        type = type,
        account = rawObject["account"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX644e86c0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX644e86c0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.account?.let { put("account", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1QuotesPostRequestFormInvoiceSettingsIssuerX644e86c0(block: InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX644e86c0.Builder.() -> Unit): InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX644e86c0 = InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX644e86c0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1QuotesPostRequestFormInvoiceSettingsIssuerX644e86c0 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
