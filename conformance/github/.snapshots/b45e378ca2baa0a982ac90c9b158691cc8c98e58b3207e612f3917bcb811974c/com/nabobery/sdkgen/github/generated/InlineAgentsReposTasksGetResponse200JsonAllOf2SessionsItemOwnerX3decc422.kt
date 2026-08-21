package com.nabobery.sdkgen.github.generated

import kotlin.Long
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * The owner of the repository
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks~1{task_id}/get/responses/200/content/appl
 * ication~1json/schema/allOf/1/properties/sessions/items/properties/owner
 */
@Serializable(with = InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemOwnerX3decc422.Serializer::class)
public class InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemOwnerX3decc422(
  /**
   * The unique identifier of the user
   */
  public val id: Long? = null,
) {
  public class Builder {
    /**
     * The unique identifier of the user
     */
    public var id: Long? = null

    public fun build(): InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemOwnerX3decc422 = InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemOwnerX3decc422(
      id = id,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemOwnerX3decc422 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemOwnerX3decc422> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemOwnerX3decc422 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemOwnerX3decc422")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemOwnerX3decc422 must be a JSON object")
      return InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemOwnerX3decc422(
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Long>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemOwnerX3decc422) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemOwnerX3decc422")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemOwnerX3decc422(block: InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemOwnerX3decc422.Builder.() -> Unit): InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemOwnerX3decc422 = InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemOwnerX3decc422.build(block)
