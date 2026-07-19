package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Filter results to generations with specific classifier tag values. Can be combined with classifier_dimensions (must
 * use the same classifier_id) or used independently with standard dimensions.
 */
@Serializable(with = InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl4b29c7dd
  .Serializer::class)
public class InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl4b29c7dd(
  /**
   * UUID of the classifier whose tags to filter by. Must match classifier_dimensions.classifier_id when both are
   * specified.
   */
  public val classifierId: String,
  filters: List<InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCld288d8d4>,
) {
  public val filters:
      List<InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCld288d8d4>
      = filters.toList()

  public class Builder {
    private var classifierIdValue: String? = null

    public var classifierId: String
      get() = requireNotNull(classifierIdValue) { "classifierId is required" }
      set(`value`) {
        classifierIdValue = value
      }

    private var filtersValue:
        List<InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCld288d8d4>?
        = null

    public var filters:
        List<InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCld288d8d4>
      get() = requireNotNull(filtersValue) { "filters is required" }
      set(`value`) {
        filtersValue = value
      }

    public fun build(): InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl4b29c7dd {
      check(classifierIdValue != null) { "classifierId is required" }
      check(filtersValue != null) { "filters is required" }
      return InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl4b29c7dd(
        classifierId = classifierId,
        filters = filters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl4b29c7dd = Builder()
        .apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl4b29c7dd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl4b29c7dd {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl4b29c7dd")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl4b29c7dd " +
          "must be a JSON object")
      val classifierId = json.decodeRequired<String>(raw, "classifier_id")
      val filters = json
























































                                                                                                                        .decodeRequired<List<InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCld288d8d4>>(raw, "filters")
      return InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl4b29c7dd(
        classifierId = classifierId,
        filters = filters,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl4b29c7dd) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl4b29c7dd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("classifier_id", value.classifierId)
        put("filters", json.encodeToJsonElement(value.filters))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl4b29c7dd(block: InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl4b29c7dd.Builder.() -> Unit): InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl4b29c7dd = InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl4b29c7dd.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl4b29c7dd " +
      "is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
