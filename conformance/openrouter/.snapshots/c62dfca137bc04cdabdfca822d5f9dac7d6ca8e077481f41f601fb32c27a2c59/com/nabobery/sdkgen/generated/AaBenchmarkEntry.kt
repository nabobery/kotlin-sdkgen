package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Double
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

internal data class SchemaInteger(
  public val negative: Boolean,
  public val digits: String,
)

internal data class SchemaDecimal(
  public val negative: Boolean,
  public val digits: String,
  public val scale: SchemaInteger,
)

/**
 * Artificial Analysis benchmark index scores.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AABenchmarkEntry
 */
@Serializable(with = AaBenchmarkEntry.Serializer::class)
public class AaBenchmarkEntry(
  /**
   * Artificial Analysis Agentic Index score
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val agenticIndex: Double?,
  /**
   * Artificial Analysis Coding Index score
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val codingIndex: Double?,
  /**
   * Artificial Analysis Intelligence Index score
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val intelligenceIndex: Double?,
) {
  public class Builder {
    private var agenticIndexState: FieldState<Double?> = FieldState.Absent

    /**
     * Artificial Analysis Agentic Index score
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     * Required nullable field; assigning `null` records present-null.
     */
    public var agenticIndex: Double?
      get() = agenticIndexState.valueOrNull()
      set(`value`) {
        agenticIndexState = value.toNullableFieldState()
      }

    private var codingIndexState: FieldState<Double?> = FieldState.Absent

    /**
     * Artificial Analysis Coding Index score
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     * Required nullable field; assigning `null` records present-null.
     */
    public var codingIndex: Double?
      get() = codingIndexState.valueOrNull()
      set(`value`) {
        codingIndexState = value.toNullableFieldState()
      }

    private var intelligenceIndexState: FieldState<Double?> = FieldState.Absent

    /**
     * Artificial Analysis Intelligence Index score
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     * Required nullable field; assigning `null` records present-null.
     */
    public var intelligenceIndex: Double?
      get() = intelligenceIndexState.valueOrNull()
      set(`value`) {
        intelligenceIndexState = value.toNullableFieldState()
      }

    public fun build(): AaBenchmarkEntry {
      check(agenticIndexState !== FieldState.Absent) { "agenticIndex is required, even when null" }
      check(codingIndexState !== FieldState.Absent) { "codingIndex is required, even when null" }
      check(intelligenceIndexState !== FieldState.Absent) { "intelligenceIndex is required, even when null" }
      return AaBenchmarkEntry(
        agenticIndex = agenticIndexState.valueOrNull(),
        codingIndex = codingIndexState.valueOrNull(),
        intelligenceIndex = intelligenceIndexState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AaBenchmarkEntry = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AaBenchmarkEntry> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AaBenchmarkEntry {
      val jsonDecoder = decoder.requireJsonDecoder("AaBenchmarkEntry")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AaBenchmarkEntry must be a JSON object")
      if (!rawObject.containsKey("agentic_index")) {
        throw SerializationException("AaBenchmarkEntry is missing required property 'agentic_index'")
      }
      val agenticIndex = rawObject["agentic_index"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(requireNotNull(element)) }
      if (!rawObject.containsKey("coding_index")) {
        throw SerializationException("AaBenchmarkEntry is missing required property 'coding_index'")
      }
      val codingIndex = rawObject["coding_index"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(requireNotNull(element)) }
      if (!rawObject.containsKey("intelligence_index")) {
        throw SerializationException("AaBenchmarkEntry is missing required property 'intelligence_index'")
      }
      val intelligenceIndex = rawObject["intelligence_index"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(requireNotNull(element)) }
      return AaBenchmarkEntry(
        agenticIndex = agenticIndex,
        codingIndex = codingIndex,
        intelligenceIndex = intelligenceIndex,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AaBenchmarkEntry) {
      val jsonEncoder = encoder.requireJsonEncoder("AaBenchmarkEntry")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("agentic_index", value.agenticIndex?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("coding_index", value.codingIndex?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("intelligence_index", value.intelligenceIndex?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun aaBenchmarkEntry(block: AaBenchmarkEntry.Builder.() -> Unit): AaBenchmarkEntry = AaBenchmarkEntry.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("AaBenchmarkEntry property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
