package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1personal-access-token-requests/post/requestBody/content/applicatio
 * n~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1personal-access-token-requests/post/requestBody/content/applicatio
 * n~1json/schema
 */
@Serializable(with = InlineOrgsPersonalAccessTokenRequestsPostRequestJsonXa2bfc743.Serializer::class)
public class InlineOrgsPersonalAccessTokenRequestsPostRequestJsonXa2bfc743(
  /**
   * Action to apply to the requests.
   */
  public val action: InlineOrgsPersonalAccessTokenRequestsPostRequestJsonActionX4e437791,
  patRequestIds: List<Int>? = null,
  /**
   * Reason for approving or denying the requests. Max 1024 characters.
   */
  public val reason: String? = null,
) {
  /**
   * Unique identifiers of the requests for access via fine-grained personal access token. Must be formed of between 1
   * and 100 `pat_request_id` values.
   */
  public val patRequestIds: List<Int>? = patRequestIds?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var actionValue: InlineOrgsPersonalAccessTokenRequestsPostRequestJsonActionX4e437791? =
        null

    public var action: InlineOrgsPersonalAccessTokenRequestsPostRequestJsonActionX4e437791
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var patRequestIdsValue: List<Int>? = null

    /**
     * Unique identifiers of the requests for access via fine-grained personal access token. Must be formed of between 1
     * and 100 `pat_request_id` values.
     */
    public var patRequestIds: List<Int>?
      get() = patRequestIdsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        patRequestIdsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Reason for approving or denying the requests. Max 1024 characters.
     */
    public var reason: String? = null

    public fun build(): InlineOrgsPersonalAccessTokenRequestsPostRequestJsonXa2bfc743 {
      check(actionValue != null) { "action is required" }
      return InlineOrgsPersonalAccessTokenRequestsPostRequestJsonXa2bfc743(
        action = action,
        patRequestIds = patRequestIds,
        reason = reason,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsPersonalAccessTokenRequestsPostRequestJsonXa2bfc743 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsPersonalAccessTokenRequestsPostRequestJsonXa2bfc743> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsPersonalAccessTokenRequestsPostRequestJsonXa2bfc743 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsPersonalAccessTokenRequestsPostRequestJsonXa2bfc743")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsPersonalAccessTokenRequestsPostRequestJsonXa2bfc743 must be a JSON object")
      val action = json.decodeRequired<InlineOrgsPersonalAccessTokenRequestsPostRequestJsonActionX4e437791>(rawObject, "action")
      return InlineOrgsPersonalAccessTokenRequestsPostRequestJsonXa2bfc743(
        action = action,
        patRequestIds = rawObject["pat_request_ids"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
        reason = rawObject["reason"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsPersonalAccessTokenRequestsPostRequestJsonXa2bfc743) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsPersonalAccessTokenRequestsPostRequestJsonXa2bfc743")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        value.patRequestIds?.let { put("pat_request_ids", json.encodeToJsonElement(it)) }
        value.reason?.let { put("reason", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsPersonalAccessTokenRequestsPostRequestJsonXa2bfc743(block: InlineOrgsPersonalAccessTokenRequestsPostRequestJsonXa2bfc743.Builder.() -> Unit): InlineOrgsPersonalAccessTokenRequestsPostRequestJsonXa2bfc743 = InlineOrgsPersonalAccessTokenRequestsPostRequestJsonXa2bfc743.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsPersonalAccessTokenRequestsPostRequestJsonXa2bfc743 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
