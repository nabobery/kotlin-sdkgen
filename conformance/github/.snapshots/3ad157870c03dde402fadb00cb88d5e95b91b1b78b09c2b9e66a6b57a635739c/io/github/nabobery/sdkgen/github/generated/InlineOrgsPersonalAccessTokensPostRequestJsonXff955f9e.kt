package io.github.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1personal-access-tokens~1{pat_id}/post/requestBody/content/applicat
 * ion~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1personal-access-tokens~1{pat_id}/post/requestBody/content/applicat
 * ion~1json/schema
 */
@Serializable(with = InlineOrgsPersonalAccessTokensPostRequestJsonXff955f9e.Serializer::class)
public class InlineOrgsPersonalAccessTokensPostRequestJsonXff955f9e(
  /**
   * Action to apply to the fine-grained personal access token.
   */
  public val action: InlineOrgsPersonalAccessTokensPostRequestJsonActionXebabf542,
) {
  public class Builder {
    private var actionValue: InlineOrgsPersonalAccessTokensPostRequestJsonActionXebabf542? = null

    public var action: InlineOrgsPersonalAccessTokensPostRequestJsonActionXebabf542
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    public fun build(): InlineOrgsPersonalAccessTokensPostRequestJsonXff955f9e {
      check(actionValue != null) { "action is required" }
      return InlineOrgsPersonalAccessTokensPostRequestJsonXff955f9e(
        action = action,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsPersonalAccessTokensPostRequestJsonXff955f9e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsPersonalAccessTokensPostRequestJsonXff955f9e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsPersonalAccessTokensPostRequestJsonXff955f9e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsPersonalAccessTokensPostRequestJsonXff955f9e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsPersonalAccessTokensPostRequestJsonXff955f9e must be a JSON object")
      val action = json.decodeRequired<InlineOrgsPersonalAccessTokensPostRequestJsonActionXebabf542>(rawObject, "action")
      return InlineOrgsPersonalAccessTokensPostRequestJsonXff955f9e(
        action = action,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsPersonalAccessTokensPostRequestJsonXff955f9e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsPersonalAccessTokensPostRequestJsonXff955f9e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsPersonalAccessTokensPostRequestJsonXff955f9e(block: InlineOrgsPersonalAccessTokensPostRequestJsonXff955f9e.Builder.() -> Unit): InlineOrgsPersonalAccessTokensPostRequestJsonXff955f9e = InlineOrgsPersonalAccessTokensPostRequestJsonXff955f9e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsPersonalAccessTokensPostRequestJsonXff955f9e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
