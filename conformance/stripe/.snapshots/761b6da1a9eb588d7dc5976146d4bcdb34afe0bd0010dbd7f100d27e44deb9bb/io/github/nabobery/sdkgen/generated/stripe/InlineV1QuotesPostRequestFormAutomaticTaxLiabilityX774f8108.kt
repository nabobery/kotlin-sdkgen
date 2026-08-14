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
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/automatic_tax/properties/liability.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/automatic_tax/properties/liability
 */
@Serializable(with = InlineV1QuotesPostRequestFormAutomaticTaxLiabilityX774f8108.Serializer::class)
public class InlineV1QuotesPostRequestFormAutomaticTaxLiabilityX774f8108(
  public val type: InlineV1QuotesPostRequestFormAutomaticTaxLiabilityTypeX1b9e4d3d,
  public val account: String? = null,
) {
  public class Builder {
    private var typeValue: InlineV1QuotesPostRequestFormAutomaticTaxLiabilityTypeX1b9e4d3d? = null

    public var type: InlineV1QuotesPostRequestFormAutomaticTaxLiabilityTypeX1b9e4d3d
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var account: String? = null

    public fun build(): InlineV1QuotesPostRequestFormAutomaticTaxLiabilityX774f8108 {
      check(typeValue != null) { "type is required" }
      return InlineV1QuotesPostRequestFormAutomaticTaxLiabilityX774f8108(
        type = type,
        account = account,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1QuotesPostRequestFormAutomaticTaxLiabilityX774f8108 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1QuotesPostRequestFormAutomaticTaxLiabilityX774f8108> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormAutomaticTaxLiabilityX774f8108 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormAutomaticTaxLiabilityX774f8108")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1QuotesPostRequestFormAutomaticTaxLiabilityX774f8108 must be a JSON object")
      val type = json.decodeRequired<InlineV1QuotesPostRequestFormAutomaticTaxLiabilityTypeX1b9e4d3d>(rawObject, "type")
      return InlineV1QuotesPostRequestFormAutomaticTaxLiabilityX774f8108(
        type = type,
        account = rawObject["account"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormAutomaticTaxLiabilityX774f8108) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormAutomaticTaxLiabilityX774f8108")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.account?.let { put("account", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1QuotesPostRequestFormAutomaticTaxLiabilityX774f8108(block: InlineV1QuotesPostRequestFormAutomaticTaxLiabilityX774f8108.Builder.() -> Unit): InlineV1QuotesPostRequestFormAutomaticTaxLiabilityX774f8108 = InlineV1QuotesPostRequestFormAutomaticTaxLiabilityX774f8108.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1QuotesPostRequestFormAutomaticTaxLiabilityX774f8108 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
