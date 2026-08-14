package io.github.nabobery.sdkgen.github.generated

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
 * Details for the advisory pertaining to the Common Vulnerability Scoring System.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/dependabot-alert-security-advisory/properties/cvss
 */
@Serializable(with = InlineDependabotAlertSecurityAdvisoryCvssX49e5a33c.Serializer::class)
public class InlineDependabotAlertSecurityAdvisoryCvssX49e5a33c(
  /**
   * The overall CVSS score of the advisory.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val score: Double,
  /**
   * The full CVSS vector string for the advisory.
   */
  public val vectorString: String?,
) {
  public class Builder {
    private var scoreValue: Double? = null

    public var score: Double
      get() = requireNotNull(scoreValue) { "score is required" }
      set(`value`) {
        scoreValue = value
      }

    private var vectorStringState: FieldState<String?> = FieldState.Absent

    /**
     * The full CVSS vector string for the advisory.
     * Required nullable field; assigning `null` records present-null.
     */
    public var vectorString: String?
      get() = vectorStringState.valueOrNull()
      set(`value`) {
        vectorStringState = value.toNullableFieldState()
      }

    public fun build(): InlineDependabotAlertSecurityAdvisoryCvssX49e5a33c {
      check(scoreValue != null) { "score is required" }
      check(vectorStringState !== FieldState.Absent) { "vectorString is required, even when null" }
      return InlineDependabotAlertSecurityAdvisoryCvssX49e5a33c(
        score = score,
        vectorString = vectorStringState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineDependabotAlertSecurityAdvisoryCvssX49e5a33c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineDependabotAlertSecurityAdvisoryCvssX49e5a33c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineDependabotAlertSecurityAdvisoryCvssX49e5a33c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineDependabotAlertSecurityAdvisoryCvssX49e5a33c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineDependabotAlertSecurityAdvisoryCvssX49e5a33c must be a JSON object")
      val score = json.decodeRequired<Double>(rawObject, "score")
      if (!rawObject.containsKey("vector_string")) {
        throw SerializationException("InlineDependabotAlertSecurityAdvisoryCvssX49e5a33c is missing required property 'vector_string'")
      }
      val vectorString = rawObject["vector_string"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineDependabotAlertSecurityAdvisoryCvssX49e5a33c(
        score = score,
        vectorString = vectorString,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineDependabotAlertSecurityAdvisoryCvssX49e5a33c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineDependabotAlertSecurityAdvisoryCvssX49e5a33c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("score", json.encodeToJsonElement(value.score))
        put("vector_string", value.vectorString?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineDependabotAlertSecurityAdvisoryCvssX49e5a33c(block: InlineDependabotAlertSecurityAdvisoryCvssX49e5a33c.Builder.() -> Unit): InlineDependabotAlertSecurityAdvisoryCvssX49e5a33c = InlineDependabotAlertSecurityAdvisoryCvssX49e5a33c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineDependabotAlertSecurityAdvisoryCvssX49e5a33c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineDependabotAlertSecurityAdvisoryCvssX49e5a33c property '" + name + "' is not nullable")
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
