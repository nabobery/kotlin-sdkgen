package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/automatic_tax/properties/liability.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/automatic_tax/properties/liability
 */
@Serializable(with = InlineV1InvoicesPostRequestFormAutomaticTaxLiabilityXce29997a.Serializer::class)
public class InlineV1InvoicesPostRequestFormAutomaticTaxLiabilityXce29997a(
  public val type: InlineV1InvoicesPostRequestFormAutomaticTaxLiabilityTypeXa501ec4e,
  public val account: String? = null,
) {
  public class Builder {
    private var typeValue: InlineV1InvoicesPostRequestFormAutomaticTaxLiabilityTypeXa501ec4e? = null

    public var type: InlineV1InvoicesPostRequestFormAutomaticTaxLiabilityTypeXa501ec4e
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var account: String? = null

    public fun build(): InlineV1InvoicesPostRequestFormAutomaticTaxLiabilityXce29997a {
      check(typeValue != null) { "type is required" }
      return InlineV1InvoicesPostRequestFormAutomaticTaxLiabilityXce29997a(
        type = type,
        account = account,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormAutomaticTaxLiabilityXce29997a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormAutomaticTaxLiabilityXce29997a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormAutomaticTaxLiabilityXce29997a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormAutomaticTaxLiabilityXce29997a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormAutomaticTaxLiabilityXce29997a must be a JSON object")
      val type = json.decodeRequired<InlineV1InvoicesPostRequestFormAutomaticTaxLiabilityTypeXa501ec4e>(rawObject, "type")
      return InlineV1InvoicesPostRequestFormAutomaticTaxLiabilityXce29997a(
        type = type,
        account = rawObject["account"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormAutomaticTaxLiabilityXce29997a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormAutomaticTaxLiabilityXce29997a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.account?.let { put("account", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesPostRequestFormAutomaticTaxLiabilityXce29997a(block: InlineV1InvoicesPostRequestFormAutomaticTaxLiabilityXce29997a.Builder.() -> Unit): InlineV1InvoicesPostRequestFormAutomaticTaxLiabilityXce29997a = InlineV1InvoicesPostRequestFormAutomaticTaxLiabilityXce29997a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesPostRequestFormAutomaticTaxLiabilityXce29997a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
