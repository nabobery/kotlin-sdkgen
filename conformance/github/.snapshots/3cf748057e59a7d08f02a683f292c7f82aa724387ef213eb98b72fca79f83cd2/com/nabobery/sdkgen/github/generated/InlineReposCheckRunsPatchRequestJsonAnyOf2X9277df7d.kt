package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-runs~1{check_run_id}/patch/requestBody/content/ap
 * plication~1json/schema/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-runs~1{check_run_id}/patch/requestBody/content/ap
 * plication~1json/schema/anyOf/1
 */
@Serializable(with = InlineReposCheckRunsPatchRequestJsonAnyOf2X9277df7d.Serializer::class)
public class InlineReposCheckRunsPatchRequestJsonAnyOf2X9277df7d internal constructor(
  private val statusState: FieldState<InlineReposCheckRunsPatchRequestJsonAnyOf2StatusX6383d0a5>,
) {
  public val status: InlineReposCheckRunsPatchRequestJsonAnyOf2StatusX6383d0a5?
    get() = statusState.valueOrNull()

  public constructor() : this(statusState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `status`.
   */
  public fun statusPresence(): FieldPresence = statusState.presence

  public class Builder {
    private var statusState: FieldState<InlineReposCheckRunsPatchRequestJsonAnyOf2StatusX6383d0a5> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var status: InlineReposCheckRunsPatchRequestJsonAnyOf2StatusX6383d0a5?
      get() = statusState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "status is not nullable; call unsetStatus() to omit it" }
        statusState = FieldState.Value(present)
      }

    /**
     * Omits `status` from serialized output.
     */
    public fun unsetStatus() {
      statusState = FieldState.Absent
    }

    public fun build(): InlineReposCheckRunsPatchRequestJsonAnyOf2X9277df7d = InlineReposCheckRunsPatchRequestJsonAnyOf2X9277df7d(
      statusState = statusState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposCheckRunsPatchRequestJsonAnyOf2X9277df7d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposCheckRunsPatchRequestJsonAnyOf2X9277df7d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposCheckRunsPatchRequestJsonAnyOf2X9277df7d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposCheckRunsPatchRequestJsonAnyOf2X9277df7d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposCheckRunsPatchRequestJsonAnyOf2X9277df7d must be a JSON object")
      return InlineReposCheckRunsPatchRequestJsonAnyOf2X9277df7d(
        statusState = json.decodeOptional(rawObject, "status", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposCheckRunsPatchRequestJsonAnyOf2X9277df7d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposCheckRunsPatchRequestJsonAnyOf2X9277df7d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("status", value.statusState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposCheckRunsPatchRequestJsonAnyOf2X9277df7d(block: InlineReposCheckRunsPatchRequestJsonAnyOf2X9277df7d.Builder.() -> Unit): InlineReposCheckRunsPatchRequestJsonAnyOf2X9277df7d = InlineReposCheckRunsPatchRequestJsonAnyOf2X9277df7d.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineReposCheckRunsPatchRequestJsonAnyOf2X9277df7d property '" + name + "' is not nullable")
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
