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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1tasks/get/responses/200/content/application~1json/schema/properties/tas
 * ks/items/properties/creator/oneOf/0
 */
@Serializable(with = InlineAgentsTasksGetResponse200JsonTasksItemCreatorOneOf1X4ef672e4.Serializer::class)
public class InlineAgentsTasksGetResponse200JsonTasksItemCreatorOneOf1X4ef672e4(
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

    public fun build(): InlineAgentsTasksGetResponse200JsonTasksItemCreatorOneOf1X4ef672e4 = InlineAgentsTasksGetResponse200JsonTasksItemCreatorOneOf1X4ef672e4(
      id = id,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsTasksGetResponse200JsonTasksItemCreatorOneOf1X4ef672e4 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineAgentsTasksGetResponse200JsonTasksItemCreatorOneOf1X4ef672e4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse200JsonTasksItemCreatorOneOf1X4ef672e4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsTasksGetResponse200JsonTasksItemCreatorOneOf1X4ef672e4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsTasksGetResponse200JsonTasksItemCreatorOneOf1X4ef672e4 must be a JSON object")
      return InlineAgentsTasksGetResponse200JsonTasksItemCreatorOneOf1X4ef672e4(
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Long>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse200JsonTasksItemCreatorOneOf1X4ef672e4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsTasksGetResponse200JsonTasksItemCreatorOneOf1X4ef672e4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsTasksGetResponse200JsonTasksItemCreatorOneOf1X4ef672e4(block: InlineAgentsTasksGetResponse200JsonTasksItemCreatorOneOf1X4ef672e4.Builder.() -> Unit): InlineAgentsTasksGetResponse200JsonTasksItemCreatorOneOf1X4ef672e4 = InlineAgentsTasksGetResponse200JsonTasksItemCreatorOneOf1X4ef672e4.build(block)
