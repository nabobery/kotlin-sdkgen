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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1meta/get/responses/200/content/application~1json/schema/properties/d
 * ata/properties/granularities/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1meta/get/responses/200/content/application~1json/schema/properties/d
 * ata/properties/granularities/items
 */
@Serializable(with = InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemXc9817b8a.Serializer::class)
public class InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemXc9817b8a(
  /**
   * Human-readable label
   */
  public val displayLabel: String,
  /**
   * Granularity identifier
   */
  public val name: InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemNameXcc968486,
) {
  public class Builder {
    private var displayLabelValue: String? = null

    public var displayLabel: String
      get() = requireNotNull(displayLabelValue) { "displayLabel is required" }
      set(`value`) {
        displayLabelValue = value
      }

    private var nameValue: InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemNameXcc968486?
        = null

    public var name: InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemNameXcc968486
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public fun build(): InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemXc9817b8a {
      check(displayLabelValue != null) { "displayLabel is required" }
      check(nameValue != null) { "name is required" }
      return InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemXc9817b8a(
        displayLabel = displayLabel,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemXc9817b8a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemXc9817b8a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemXc9817b8a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemXc9817b8a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemXc9817b8a must be a JSON object")
      val displayLabel = json.decodeRequired<String>(rawObject, "display_label")
      val name = json.decodeRequired<InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemNameXcc968486>(rawObject, "name")
      return InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemXc9817b8a(
        displayLabel = displayLabel,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemXc9817b8a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemXc9817b8a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("display_label", value.displayLabel)
        put("name", json.encodeToJsonElement(value.name))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemXc9817b8a(block: InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemXc9817b8a.Builder.() -> Unit): InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemXc9817b8a = InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemXc9817b8a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemXc9817b8a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
