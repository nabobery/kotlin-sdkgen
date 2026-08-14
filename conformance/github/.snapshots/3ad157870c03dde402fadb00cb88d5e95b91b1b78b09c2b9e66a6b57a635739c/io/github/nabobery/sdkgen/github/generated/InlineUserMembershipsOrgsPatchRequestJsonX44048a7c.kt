package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1user~1memberships~1orgs~1{org}/patch/requestBody/content/application~1json/sche
 * ma.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1user~1memberships~1orgs~1{org}/patch/requestBody/content/application~1json/sche
 * ma
 */
@Serializable(with = InlineUserMembershipsOrgsPatchRequestJsonX44048a7c.Serializer::class)
public class InlineUserMembershipsOrgsPatchRequestJsonX44048a7c(
  /**
   * The state that the membership should be in. Only `"active"` will be accepted.
   */
  public val state: InlineUserMembershipsOrgsPatchRequestJsonStateXc6f7f1cf,
) {
  public class Builder {
    private var stateValue: InlineUserMembershipsOrgsPatchRequestJsonStateXc6f7f1cf? = null

    public var state: InlineUserMembershipsOrgsPatchRequestJsonStateXc6f7f1cf
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    public fun build(): InlineUserMembershipsOrgsPatchRequestJsonX44048a7c {
      check(stateValue != null) { "state is required" }
      return InlineUserMembershipsOrgsPatchRequestJsonX44048a7c(
        state = state,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUserMembershipsOrgsPatchRequestJsonX44048a7c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineUserMembershipsOrgsPatchRequestJsonX44048a7c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUserMembershipsOrgsPatchRequestJsonX44048a7c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUserMembershipsOrgsPatchRequestJsonX44048a7c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUserMembershipsOrgsPatchRequestJsonX44048a7c must be a JSON object")
      val state = json.decodeRequired<InlineUserMembershipsOrgsPatchRequestJsonStateXc6f7f1cf>(rawObject, "state")
      return InlineUserMembershipsOrgsPatchRequestJsonX44048a7c(
        state = state,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUserMembershipsOrgsPatchRequestJsonX44048a7c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUserMembershipsOrgsPatchRequestJsonX44048a7c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("state", json.encodeToJsonElement(value.state))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUserMembershipsOrgsPatchRequestJsonX44048a7c(block: InlineUserMembershipsOrgsPatchRequestJsonX44048a7c.Builder.() -> Unit): InlineUserMembershipsOrgsPatchRequestJsonX44048a7c = InlineUserMembershipsOrgsPatchRequestJsonX44048a7c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUserMembershipsOrgsPatchRequestJsonX44048a7c is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineUserMembershipsOrgsPatchRequestJsonX44048a7c property '" + name + "' is not nullable")
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
