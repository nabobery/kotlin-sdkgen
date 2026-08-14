package io.github.nabobery.sdkgen.generated

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
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1query/post/requestBody/content/application~1json/schema/properties/c
 * lassifier_dimensions
 */
@Serializable(with = InlineAnalyticsQueryPostRequestJsonClassifierDimensionsX7205245e.Serializer::class)
public class InlineAnalyticsQueryPostRequestJsonClassifierDimensionsX7205245e(
  /**
   * UUID of the classifier whose tags to group by.
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val classifierId: String,
  dimensionNames: List<String>? = null,
  /**
   * When true, also include generations that have no tag from this classifier. Defaults to false, which returns only
   * classified generations.
   */
  public val includeNulls: Boolean? = null,
) {
  public val dimensionNames: List<String>? =
      dimensionNames?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var classifierIdValue: String? = null

    public var classifierId: String
      get() = requireNotNull(classifierIdValue) { "classifierId is required" }
      set(`value`) {
        classifierIdValue = value
      }

    private var dimensionNamesValue: List<String>? = null

    public var dimensionNames: List<String>?
      get() = dimensionNamesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        dimensionNamesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * When true, also include generations that have no tag from this classifier. Defaults to false, which returns only
     * classified generations.
     */
    public var includeNulls: Boolean? = null

    public fun build(): InlineAnalyticsQueryPostRequestJsonClassifierDimensionsX7205245e {
      check(classifierIdValue != null) { "classifierId is required" }
      return InlineAnalyticsQueryPostRequestJsonClassifierDimensionsX7205245e(
        classifierId = classifierId,
        dimensionNames = dimensionNames,
        includeNulls = includeNulls,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAnalyticsQueryPostRequestJsonClassifierDimensionsX7205245e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAnalyticsQueryPostRequestJsonClassifierDimensionsX7205245e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAnalyticsQueryPostRequestJsonClassifierDimensionsX7205245e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAnalyticsQueryPostRequestJsonClassifierDimensionsX7205245e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAnalyticsQueryPostRequestJsonClassifierDimensionsX7205245e must be a JSON object")
      val classifierId = json.decodeRequired<String>(rawObject, "classifier_id")
      return InlineAnalyticsQueryPostRequestJsonClassifierDimensionsX7205245e(
        classifierId = classifierId,
        dimensionNames = rawObject["dimension_names"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        includeNulls = rawObject["include_nulls"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAnalyticsQueryPostRequestJsonClassifierDimensionsX7205245e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAnalyticsQueryPostRequestJsonClassifierDimensionsX7205245e")
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

public fun inlineAnalyticsQueryPostRequestJsonClassifierDimensionsX7205245e(block: InlineAnalyticsQueryPostRequestJsonClassifierDimensionsX7205245e.Builder.() -> Unit): InlineAnalyticsQueryPostRequestJsonClassifierDimensionsX7205245e = InlineAnalyticsQueryPostRequestJsonClassifierDimensionsX7205245e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAnalyticsQueryPostRequestJsonClassifierDimensionsX7205245e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
