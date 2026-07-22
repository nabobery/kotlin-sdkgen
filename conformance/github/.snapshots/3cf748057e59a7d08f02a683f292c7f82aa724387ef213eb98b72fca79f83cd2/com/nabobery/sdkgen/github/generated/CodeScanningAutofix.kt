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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/code-scanning-autofix.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-autofix
 */
@Serializable(with = CodeScanningAutofix.Serializer::class)
public class CodeScanningAutofix(
  public val description: String?,
  public val startedAt: String,
  public val status: CodeScanningAutofixStatus,
) {
  public class Builder {
    private var startedAtValue: String? = null

    public var startedAt: String
      get() = requireNotNull(startedAtValue) { "startedAt is required" }
      set(`value`) {
        startedAtValue = value
      }

    private var statusValue: CodeScanningAutofixStatus? = null

    public var status: CodeScanningAutofixStatus
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var descriptionState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        descriptionState = value.toNullableFieldState()
      }

    public fun build(): CodeScanningAutofix {
      check(startedAtValue != null) { "startedAt is required" }
      check(statusValue != null) { "status is required" }
      check(descriptionState !== FieldState.Absent) { "description is required, even when null" }
      return CodeScanningAutofix(
        description = descriptionState.valueOrNull(),
        startedAt = startedAt,
        status = status,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodeScanningAutofix = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CodeScanningAutofix> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodeScanningAutofix {
      val jsonDecoder = decoder.requireJsonDecoder("CodeScanningAutofix")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodeScanningAutofix must be a JSON object")
      val startedAt = json.decodeRequired<String>(rawObject, "started_at")
      val status = json.decodeRequired<CodeScanningAutofixStatus>(rawObject, "status")
      if (!rawObject.containsKey("description")) {
        throw SerializationException("CodeScanningAutofix is missing required property 'description'")
      }
      val description = rawObject["description"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return CodeScanningAutofix(
        description = description,
        startedAt = startedAt,
        status = status,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodeScanningAutofix) {
      val jsonEncoder = encoder.requireJsonEncoder("CodeScanningAutofix")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("description", value.description?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("started_at", value.startedAt)
        put("status", json.encodeToJsonElement(value.status))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codeScanningAutofix(block: CodeScanningAutofix.Builder.() -> Unit): CodeScanningAutofix = CodeScanningAutofix.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CodeScanningAutofix is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("CodeScanningAutofix property '" + name + "' is not nullable")
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
