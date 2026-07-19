package com.nabobery.sdkgen.generated

import kotlin.Boolean
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
 * Group results by custom classifier tags, breaking down metrics by the specified dimension values. Requires an active
 * classifier on the workspace.
 */
@Serializable(with = InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl7205245e
  .Serializer::class)
public class InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl7205245e(
  /**
   * UUID of the classifier whose tags to group by.
   */
  public val classifierId: String,
  public val dimensionNames: List<String>? = null,
  /**
   * When true, also include generations that have no tag from this classifier. Defaults to false, which returns only
   * classified generations.
   */
  public val includeNulls: Boolean? = null,
) {
  public class Builder {
    private var classifierIdValue: String? = null

    public var classifierId: String
      get() = requireNotNull(classifierIdValue) { "classifierId is required" }
      set(`value`) {
        classifierIdValue = value
      }

    public var dimensionNames: List<String>? = null

    /**
     * When true, also include generations that have no tag from this classifier. Defaults to false, which returns only
     * classified generations.
     */
    public var includeNulls: Boolean? = null

    public fun build(): InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl7205245e {
      check(classifierIdValue != null) { "classifierId is required" }
      return InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl7205245e(
        classifierId = classifierId,
        dimensionNames = dimensionNames,
        includeNulls = includeNulls,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl7205245e = Builder()
        .apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl7205245e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl7205245e {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl7205245e")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl7205245e " +
          "must be a JSON object")
      val classifierId = json.decodeRequired<String>(raw, "classifier_id")
      return InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl7205245e(
        classifierId = classifierId,
        dimensionNames = raw["dimension_names"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        includeNulls = raw["include_nulls"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl7205245e) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl7205245e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("classifier_id", value.classifierId)
        value.dimensionNames?.let { put("dimension_names", json.encodeToJsonElement(it)) }
        value.includeNulls?.let { put("include_nulls", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl7205245e(block: InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl7205245e.Builder.() -> Unit): InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl7205245e = InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl7205245e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl7205245e " +
      "is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
