package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Error details for a failed session
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks~1{task_id}/get/responses/200/content/appl
 * ication~1json/schema/allOf/1/properties/sessions/items/properties/error
 */
@Serializable(with = InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemErrorX3e4f2072.Serializer::class)
public class InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemErrorX3e4f2072(
  /**
   * Error message
   */
  public val message: String? = null,
) {
  public class Builder {
    /**
     * Error message
     */
    public var message: String? = null

    public fun build(): InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemErrorX3e4f2072 = InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemErrorX3e4f2072(
      message = message,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemErrorX3e4f2072 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemErrorX3e4f2072> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemErrorX3e4f2072 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemErrorX3e4f2072")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemErrorX3e4f2072 must be a JSON object")
      return InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemErrorX3e4f2072(
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemErrorX3e4f2072) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemErrorX3e4f2072")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.message?.let { put("message", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemErrorX3e4f2072(block: InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemErrorX3e4f2072.Builder.() -> Unit): InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemErrorX3e4f2072 = InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemErrorX3e4f2072.build(block)
