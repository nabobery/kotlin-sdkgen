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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1products/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/marketing_features/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1products/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/marketing_features/items
 */
@Serializable(with = InlineV1ProductsPostRequestFormMarketingFeaturesItemX4b4c8555.Serializer::class)
public class InlineV1ProductsPostRequestFormMarketingFeaturesItemX4b4c8555(
  public val name: String,
) {
  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public fun build(): InlineV1ProductsPostRequestFormMarketingFeaturesItemX4b4c8555 {
      check(nameValue != null) { "name is required" }
      return InlineV1ProductsPostRequestFormMarketingFeaturesItemX4b4c8555(
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1ProductsPostRequestFormMarketingFeaturesItemX4b4c8555 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1ProductsPostRequestFormMarketingFeaturesItemX4b4c8555> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ProductsPostRequestFormMarketingFeaturesItemX4b4c8555 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ProductsPostRequestFormMarketingFeaturesItemX4b4c8555")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ProductsPostRequestFormMarketingFeaturesItemX4b4c8555 must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineV1ProductsPostRequestFormMarketingFeaturesItemX4b4c8555(
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ProductsPostRequestFormMarketingFeaturesItemX4b4c8555) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ProductsPostRequestFormMarketingFeaturesItemX4b4c8555")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1ProductsPostRequestFormMarketingFeaturesItemX4b4c8555(block: InlineV1ProductsPostRequestFormMarketingFeaturesItemX4b4c8555.Builder.() -> Unit): InlineV1ProductsPostRequestFormMarketingFeaturesItemX4b4c8555 = InlineV1ProductsPostRequestFormMarketingFeaturesItemX4b4c8555.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1ProductsPostRequestFormMarketingFeaturesItemX4b4c8555 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
