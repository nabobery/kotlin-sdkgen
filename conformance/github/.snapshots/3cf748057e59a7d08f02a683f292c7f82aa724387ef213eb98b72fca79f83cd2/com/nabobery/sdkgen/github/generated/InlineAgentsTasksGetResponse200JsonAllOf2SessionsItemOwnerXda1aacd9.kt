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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1tasks~1{task_id}/get/responses/200/content/application~1json/schema/all
 * Of/1/properties/sessions/items/properties/owner
 */
@Serializable(with = InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemOwnerXda1aacd9.Serializer::class)
public class InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemOwnerXda1aacd9(
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

    public fun build(): InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemOwnerXda1aacd9 = InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemOwnerXda1aacd9(
      id = id,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemOwnerXda1aacd9 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemOwnerXda1aacd9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemOwnerXda1aacd9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemOwnerXda1aacd9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemOwnerXda1aacd9 must be a JSON object")
      return InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemOwnerXda1aacd9(
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Long>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemOwnerXda1aacd9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemOwnerXda1aacd9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsTasksGetResponse200JsonAllOf2SessionsItemOwnerXda1aacd9(block: InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemOwnerXda1aacd9.Builder.() -> Unit): InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemOwnerXda1aacd9 = InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemOwnerXda1aacd9.build(block)
