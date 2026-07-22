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
 * A GitHub user
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1tasks~1{task_id}/get/responses/200/content/application~1json/schema/all
 * Of/0/properties/creator/oneOf/0
 */
@Serializable(with = InlineAgentsTasksGetResponse200JsonAllOf1CreatorOneOf1X9407d814.Serializer::class)
public class InlineAgentsTasksGetResponse200JsonAllOf1CreatorOneOf1X9407d814(
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

    public fun build(): InlineAgentsTasksGetResponse200JsonAllOf1CreatorOneOf1X9407d814 = InlineAgentsTasksGetResponse200JsonAllOf1CreatorOneOf1X9407d814(
      id = id,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsTasksGetResponse200JsonAllOf1CreatorOneOf1X9407d814 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineAgentsTasksGetResponse200JsonAllOf1CreatorOneOf1X9407d814> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse200JsonAllOf1CreatorOneOf1X9407d814 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsTasksGetResponse200JsonAllOf1CreatorOneOf1X9407d814")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsTasksGetResponse200JsonAllOf1CreatorOneOf1X9407d814 must be a JSON object")
      return InlineAgentsTasksGetResponse200JsonAllOf1CreatorOneOf1X9407d814(
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Long>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse200JsonAllOf1CreatorOneOf1X9407d814) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsTasksGetResponse200JsonAllOf1CreatorOneOf1X9407d814")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsTasksGetResponse200JsonAllOf1CreatorOneOf1X9407d814(block: InlineAgentsTasksGetResponse200JsonAllOf1CreatorOneOf1X9407d814.Builder.() -> Unit): InlineAgentsTasksGetResponse200JsonAllOf1CreatorOneOf1X9407d814 = InlineAgentsTasksGetResponse200JsonAllOf1CreatorOneOf1X9407d814.build(block)
