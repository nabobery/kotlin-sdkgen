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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1personal-access-token-requests~1{pat_request_id}/post/requestBody/
 * content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1personal-access-token-requests~1{pat_request_id}/post/requestBody/
 * content/application~1json/schema
 */
@Serializable(with = InlineOrgsPersonalAccessTokenRequestsPostRequestJsonX8f92e72e.Serializer::class)
public class InlineOrgsPersonalAccessTokenRequestsPostRequestJsonX8f92e72e(
  /**
   * Action to apply to the request.
   */
  public val action: InlineOrgsPersonalAccessTokenRequestsPostRequestJsonActionXf201ee01,
  /**
   * Reason for approving or denying the request. Max 1024 characters.
   */
  public val reason: String? = null,
) {
  public class Builder {
    private var actionValue: InlineOrgsPersonalAccessTokenRequestsPostRequestJsonActionXf201ee01? =
        null

    public var action: InlineOrgsPersonalAccessTokenRequestsPostRequestJsonActionXf201ee01
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    /**
     * Reason for approving or denying the request. Max 1024 characters.
     */
    public var reason: String? = null

    public fun build(): InlineOrgsPersonalAccessTokenRequestsPostRequestJsonX8f92e72e {
      check(actionValue != null) { "action is required" }
      return InlineOrgsPersonalAccessTokenRequestsPostRequestJsonX8f92e72e(
        action = action,
        reason = reason,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsPersonalAccessTokenRequestsPostRequestJsonX8f92e72e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsPersonalAccessTokenRequestsPostRequestJsonX8f92e72e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsPersonalAccessTokenRequestsPostRequestJsonX8f92e72e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsPersonalAccessTokenRequestsPostRequestJsonX8f92e72e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsPersonalAccessTokenRequestsPostRequestJsonX8f92e72e must be a JSON object")
      val action = json.decodeRequired<InlineOrgsPersonalAccessTokenRequestsPostRequestJsonActionXf201ee01>(rawObject, "action")
      return InlineOrgsPersonalAccessTokenRequestsPostRequestJsonX8f92e72e(
        action = action,
        reason = rawObject["reason"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsPersonalAccessTokenRequestsPostRequestJsonX8f92e72e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsPersonalAccessTokenRequestsPostRequestJsonX8f92e72e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        value.reason?.let { put("reason", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsPersonalAccessTokenRequestsPostRequestJsonX8f92e72e(block: InlineOrgsPersonalAccessTokenRequestsPostRequestJsonX8f92e72e.Builder.() -> Unit): InlineOrgsPersonalAccessTokenRequestsPostRequestJsonX8f92e72e = InlineOrgsPersonalAccessTokenRequestsPostRequestJsonX8f92e72e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsPersonalAccessTokenRequestsPostRequestJsonX8f92e72e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
