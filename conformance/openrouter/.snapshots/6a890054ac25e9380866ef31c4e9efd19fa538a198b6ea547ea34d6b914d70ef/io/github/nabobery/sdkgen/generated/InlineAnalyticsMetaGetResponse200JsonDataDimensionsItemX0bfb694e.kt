package io.github.nabobery.sdkgen.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1meta/get/responses/200/content/application~1json/schema/properties/d
 * ata/properties/dimensions/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1meta/get/responses/200/content/application~1json/schema/properties/d
 * ata/properties/dimensions/items
 */
@Serializable(with = InlineAnalyticsMetaGetResponse200JsonDataDimensionsItemX0bfb694e.Serializer::class)
public class InlineAnalyticsMetaGetResponse200JsonDataDimensionsItemX0bfb694e(
  /**
   * Human-readable label
   */
  public val displayLabel: String,
  /**
   * Dimension identifier used in query requests
   */
  public val name: String,
) {
  public class Builder {
    private var displayLabelValue: String? = null

    public var displayLabel: String
      get() = requireNotNull(displayLabelValue) { "displayLabel is required" }
      set(`value`) {
        displayLabelValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public fun build(): InlineAnalyticsMetaGetResponse200JsonDataDimensionsItemX0bfb694e {
      check(displayLabelValue != null) { "displayLabel is required" }
      check(nameValue != null) { "name is required" }
      return InlineAnalyticsMetaGetResponse200JsonDataDimensionsItemX0bfb694e(
        displayLabel = displayLabel,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAnalyticsMetaGetResponse200JsonDataDimensionsItemX0bfb694e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAnalyticsMetaGetResponse200JsonDataDimensionsItemX0bfb694e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAnalyticsMetaGetResponse200JsonDataDimensionsItemX0bfb694e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAnalyticsMetaGetResponse200JsonDataDimensionsItemX0bfb694e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAnalyticsMetaGetResponse200JsonDataDimensionsItemX0bfb694e must be a JSON object")
      val displayLabel = json.decodeRequired<String>(rawObject, "display_label")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineAnalyticsMetaGetResponse200JsonDataDimensionsItemX0bfb694e(
        displayLabel = displayLabel,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAnalyticsMetaGetResponse200JsonDataDimensionsItemX0bfb694e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAnalyticsMetaGetResponse200JsonDataDimensionsItemX0bfb694e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("display_label", value.displayLabel)
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAnalyticsMetaGetResponse200JsonDataDimensionsItemX0bfb694e(block: InlineAnalyticsMetaGetResponse200JsonDataDimensionsItemX0bfb694e.Builder.() -> Unit): InlineAnalyticsMetaGetResponse200JsonDataDimensionsItemX0bfb694e = InlineAnalyticsMetaGetResponse200JsonDataDimensionsItemX0bfb694e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAnalyticsMetaGetResponse200JsonDataDimensionsItemX0bfb694e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
