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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1applications~1{client_id}~1token/patch/requestBody/content/application~1json/sc
 * hema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1applications~1{client_id}~1token/patch/requestBody/content/application~1json/sc
 * hema
 */
@Serializable(with = InlineApplicationsTokenPatchRequestJsonX56aa4ab6.Serializer::class)
public class InlineApplicationsTokenPatchRequestJsonX56aa4ab6(
  /**
   * The access_token of the OAuth or GitHub application.
   */
  public val accessToken: String,
) {
  public class Builder {
    private var accessTokenValue: String? = null

    public var accessToken: String
      get() = requireNotNull(accessTokenValue) { "accessToken is required" }
      set(`value`) {
        accessTokenValue = value
      }

    public fun build(): InlineApplicationsTokenPatchRequestJsonX56aa4ab6 {
      check(accessTokenValue != null) { "accessToken is required" }
      return InlineApplicationsTokenPatchRequestJsonX56aa4ab6(
        accessToken = accessToken,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineApplicationsTokenPatchRequestJsonX56aa4ab6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineApplicationsTokenPatchRequestJsonX56aa4ab6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineApplicationsTokenPatchRequestJsonX56aa4ab6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineApplicationsTokenPatchRequestJsonX56aa4ab6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineApplicationsTokenPatchRequestJsonX56aa4ab6 must be a JSON object")
      val accessToken = json.decodeRequired<String>(rawObject, "access_token")
      return InlineApplicationsTokenPatchRequestJsonX56aa4ab6(
        accessToken = accessToken,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineApplicationsTokenPatchRequestJsonX56aa4ab6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineApplicationsTokenPatchRequestJsonX56aa4ab6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("access_token", value.accessToken)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineApplicationsTokenPatchRequestJsonX56aa4ab6(block: InlineApplicationsTokenPatchRequestJsonX56aa4ab6.Builder.() -> Unit): InlineApplicationsTokenPatchRequestJsonX56aa4ab6 = InlineApplicationsTokenPatchRequestJsonX56aa4ab6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineApplicationsTokenPatchRequestJsonX56aa4ab6 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineApplicationsTokenPatchRequestJsonX56aa4ab6 property '" + name + "' is not nullable")
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
