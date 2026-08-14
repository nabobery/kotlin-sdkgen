package io.github.nabobery.sdkgen.generated

import kotlin.Int
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/TaskClassificationResponse/properties/data.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/TaskClassificationResponse/properties/data
 */
@Serializable(with = InlineTaskClassificationResponseDataX0cad7694.Serializer::class)
public class InlineTaskClassificationResponseDataX0cad7694(
  /**
   * UTC date (YYYY-MM-DD) of the window upper bound (yesterday). Data is exclusive of the current incomplete UTC day.
   * This is the expected latest date in the snapshot; it does not confirm data presence for that date.
   */
  public val asOf: String,
  classifications: List<TaskClassificationItem>,
  macroCategories: List<TaskClassificationMacroCategory>,
  /**
   * Number of trailing days covered by this snapshot.
   */
  public val windowDays: Int,
) {
  /**
   * Per-task classification market-share data, sorted by usage_share descending.
   */
  public val classifications: List<TaskClassificationItem> = classifications.toList()

  /**
   * Aggregate market-share data per macro-category (code, data, agent, general).
   */
  public val macroCategories: List<TaskClassificationMacroCategory> = macroCategories.toList()

  public class Builder {
    private var asOfValue: String? = null

    public var asOf: String
      get() = requireNotNull(asOfValue) { "asOf is required" }
      set(`value`) {
        asOfValue = value
      }

    private var classificationsValue: List<TaskClassificationItem>? = null

    public var classifications: List<TaskClassificationItem>
      get() = requireNotNull(classificationsValue) { "classifications is required" }.toList()
      set(`value`) {
        classificationsValue = value.toList()
      }

    private var macroCategoriesValue: List<TaskClassificationMacroCategory>? = null

    public var macroCategories: List<TaskClassificationMacroCategory>
      get() = requireNotNull(macroCategoriesValue) { "macroCategories is required" }.toList()
      set(`value`) {
        macroCategoriesValue = value.toList()
      }

    private var windowDaysValue: Int? = null

    public var windowDays: Int
      get() = requireNotNull(windowDaysValue) { "windowDays is required" }
      set(`value`) {
        windowDaysValue = value
      }

    public fun build(): InlineTaskClassificationResponseDataX0cad7694 {
      check(asOfValue != null) { "asOf is required" }
      check(classificationsValue != null) { "classifications is required" }
      check(macroCategoriesValue != null) { "macroCategories is required" }
      check(windowDaysValue != null) { "windowDays is required" }
      return InlineTaskClassificationResponseDataX0cad7694(
        asOf = asOf,
        classifications = classifications,
        macroCategories = macroCategories,
        windowDays = windowDays,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineTaskClassificationResponseDataX0cad7694 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineTaskClassificationResponseDataX0cad7694> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTaskClassificationResponseDataX0cad7694 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTaskClassificationResponseDataX0cad7694")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineTaskClassificationResponseDataX0cad7694 must be a JSON object")
      val asOf = json.decodeRequired<String>(rawObject, "as_of")
      val classifications = json.decodeRequired<List<TaskClassificationItem>>(rawObject, "classifications")
      val macroCategories = json.decodeRequired<List<TaskClassificationMacroCategory>>(rawObject, "macro_categories")
      val windowDays = json.decodeRequired<Int>(rawObject, "window_days")
      return InlineTaskClassificationResponseDataX0cad7694(
        asOf = asOf,
        classifications = classifications,
        macroCategories = macroCategories,
        windowDays = windowDays,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineTaskClassificationResponseDataX0cad7694) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineTaskClassificationResponseDataX0cad7694")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("as_of", value.asOf)
        put("classifications", json.encodeToJsonElement(value.classifications))
        put("macro_categories", json.encodeToJsonElement(value.macroCategories))
        put("window_days", json.encodeToJsonElement(value.windowDays))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineTaskClassificationResponseDataX0cad7694(block: InlineTaskClassificationResponseDataX0cad7694.Builder.() -> Unit): InlineTaskClassificationResponseDataX0cad7694 = InlineTaskClassificationResponseDataX0cad7694.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineTaskClassificationResponseDataX0cad7694 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
