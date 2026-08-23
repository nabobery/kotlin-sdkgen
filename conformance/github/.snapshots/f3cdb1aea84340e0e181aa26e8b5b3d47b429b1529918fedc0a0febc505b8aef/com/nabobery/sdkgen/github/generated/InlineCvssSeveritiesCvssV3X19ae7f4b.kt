package com.nabobery.sdkgen.github.generated

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

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/cvss-severities/properties/cvss_v3.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/cvss-severities/properties/cvss_v3
 */
@Serializable(with = InlineCvssSeveritiesCvssV3X19ae7f4b.Serializer::class)
public class InlineCvssSeveritiesCvssV3X19ae7f4b(
  /**
   * The CVSS 3 score.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val score: Double?,
  /**
   * The CVSS 3 vector string.
   */
  public val vectorString: String?,
) {
  public class Builder {
    private var scoreState: FieldState<Double?> = FieldState.Absent

    /**
     * The CVSS 3 score.
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     * Required nullable field; assigning `null` records present-null.
     */
    public var score: Double?
      get() = scoreState.valueOrNull()
      set(`value`) {
        scoreState = value.toNullableFieldState()
      }

    private var vectorStringState: FieldState<String?> = FieldState.Absent

    /**
     * The CVSS 3 vector string.
     * Required nullable field; assigning `null` records present-null.
     */
    public var vectorString: String?
      get() = vectorStringState.valueOrNull()
      set(`value`) {
        vectorStringState = value.toNullableFieldState()
      }

    public fun build(): InlineCvssSeveritiesCvssV3X19ae7f4b {
      check(scoreState !== FieldState.Absent) { "score is required, even when null" }
      check(vectorStringState !== FieldState.Absent) { "vectorString is required, even when null" }
      return InlineCvssSeveritiesCvssV3X19ae7f4b(
        score = scoreState.valueOrNull(),
        vectorString = vectorStringState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCvssSeveritiesCvssV3X19ae7f4b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineCvssSeveritiesCvssV3X19ae7f4b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCvssSeveritiesCvssV3X19ae7f4b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCvssSeveritiesCvssV3X19ae7f4b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCvssSeveritiesCvssV3X19ae7f4b must be a JSON object")
      if (!rawObject.containsKey("score")) {
        throw SerializationException("InlineCvssSeveritiesCvssV3X19ae7f4b is missing required property 'score'")
      }
      val score = rawObject["score"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(requireNotNull(element)) }
      if (!rawObject.containsKey("vector_string")) {
        throw SerializationException("InlineCvssSeveritiesCvssV3X19ae7f4b is missing required property 'vector_string'")
      }
      val vectorString = rawObject["vector_string"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineCvssSeveritiesCvssV3X19ae7f4b(
        score = score,
        vectorString = vectorString,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCvssSeveritiesCvssV3X19ae7f4b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCvssSeveritiesCvssV3X19ae7f4b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("score", value.score?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("vector_string", value.vectorString?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCvssSeveritiesCvssV3X19ae7f4b(block: InlineCvssSeveritiesCvssV3X19ae7f4b.Builder.() -> Unit): InlineCvssSeveritiesCvssV3X19ae7f4b = InlineCvssSeveritiesCvssV3X19ae7f4b.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineCvssSeveritiesCvssV3X19ae7f4b property '" + name + "' is not nullable")
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
