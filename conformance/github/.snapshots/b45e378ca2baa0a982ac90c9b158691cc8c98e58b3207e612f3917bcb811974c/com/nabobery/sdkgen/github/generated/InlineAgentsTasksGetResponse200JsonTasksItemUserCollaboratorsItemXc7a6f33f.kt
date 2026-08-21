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
 * ks/items/properties/user_collaborators/items
 */
@Serializable(with = InlineAgentsTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc7a6f33f.Serializer::class)
public class InlineAgentsTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc7a6f33f(
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

    public fun build(): InlineAgentsTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc7a6f33f = InlineAgentsTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc7a6f33f(
      id = id,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc7a6f33f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAgentsTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc7a6f33f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc7a6f33f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc7a6f33f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc7a6f33f must be a JSON object")
      return InlineAgentsTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc7a6f33f(
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Long>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc7a6f33f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc7a6f33f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc7a6f33f(block: InlineAgentsTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc7a6f33f.Builder.() -> Unit): InlineAgentsTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc7a6f33f = InlineAgentsTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc7a6f33f.build(block)
