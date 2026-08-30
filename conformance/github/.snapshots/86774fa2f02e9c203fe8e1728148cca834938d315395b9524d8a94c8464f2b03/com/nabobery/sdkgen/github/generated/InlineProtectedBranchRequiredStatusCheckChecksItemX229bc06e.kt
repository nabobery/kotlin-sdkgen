package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
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
 * sdkgen://source/openapi.yaml#/components/schemas/protected-branch-required-status-check/properties/checks/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/protected-branch-required-status-check/properties/checks/items
 */
@Serializable(with = InlineProtectedBranchRequiredStatusCheckChecksItemX229bc06e.Serializer::class)
public class InlineProtectedBranchRequiredStatusCheckChecksItemX229bc06e(
  public val appId: Int?,
  public val context: String,
) {
  public class Builder {
    private var contextValue: String? = null

    public var context: String
      get() = requireNotNull(contextValue) { "context is required" }
      set(`value`) {
        contextValue = value
      }

    private var appIdState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var appId: Int?
      get() = appIdState.valueOrNull()
      set(`value`) {
        appIdState = value.toNullableFieldState()
      }

    public fun build(): InlineProtectedBranchRequiredStatusCheckChecksItemX229bc06e {
      check(contextValue != null) { "context is required" }
      check(appIdState !== FieldState.Absent) { "appId is required, even when null" }
      return InlineProtectedBranchRequiredStatusCheckChecksItemX229bc06e(
        appId = appIdState.valueOrNull(),
        context = context,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineProtectedBranchRequiredStatusCheckChecksItemX229bc06e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineProtectedBranchRequiredStatusCheckChecksItemX229bc06e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineProtectedBranchRequiredStatusCheckChecksItemX229bc06e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineProtectedBranchRequiredStatusCheckChecksItemX229bc06e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineProtectedBranchRequiredStatusCheckChecksItemX229bc06e must be a JSON object")
      val context = json.decodeRequired<String>(rawObject, "context")
      if (!rawObject.containsKey("app_id")) {
        throw SerializationException("InlineProtectedBranchRequiredStatusCheckChecksItemX229bc06e is missing required property 'app_id'")
      }
      val appId = rawObject["app_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      return InlineProtectedBranchRequiredStatusCheckChecksItemX229bc06e(
        appId = appId,
        context = context,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineProtectedBranchRequiredStatusCheckChecksItemX229bc06e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineProtectedBranchRequiredStatusCheckChecksItemX229bc06e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("app_id", value.appId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("context", value.context)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineProtectedBranchRequiredStatusCheckChecksItemX229bc06e(block: InlineProtectedBranchRequiredStatusCheckChecksItemX229bc06e.Builder.() -> Unit): InlineProtectedBranchRequiredStatusCheckChecksItemX229bc06e = InlineProtectedBranchRequiredStatusCheckChecksItemX229bc06e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineProtectedBranchRequiredStatusCheckChecksItemX229bc06e is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineProtectedBranchRequiredStatusCheckChecksItemX229bc06e property '" + name + "' is not nullable")
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
