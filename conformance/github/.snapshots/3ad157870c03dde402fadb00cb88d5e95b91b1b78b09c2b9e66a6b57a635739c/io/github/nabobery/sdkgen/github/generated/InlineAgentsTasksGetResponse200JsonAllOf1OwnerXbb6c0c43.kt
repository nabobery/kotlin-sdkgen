package io.github.nabobery.sdkgen.github.generated

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
 * Of/0/properties/owner
 */
@Serializable(with = InlineAgentsTasksGetResponse200JsonAllOf1OwnerXbb6c0c43.Serializer::class)
public class InlineAgentsTasksGetResponse200JsonAllOf1OwnerXbb6c0c43(
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

    public fun build(): InlineAgentsTasksGetResponse200JsonAllOf1OwnerXbb6c0c43 = InlineAgentsTasksGetResponse200JsonAllOf1OwnerXbb6c0c43(
      id = id,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsTasksGetResponse200JsonAllOf1OwnerXbb6c0c43 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAgentsTasksGetResponse200JsonAllOf1OwnerXbb6c0c43> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse200JsonAllOf1OwnerXbb6c0c43 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsTasksGetResponse200JsonAllOf1OwnerXbb6c0c43")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsTasksGetResponse200JsonAllOf1OwnerXbb6c0c43 must be a JSON object")
      return InlineAgentsTasksGetResponse200JsonAllOf1OwnerXbb6c0c43(
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Long>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse200JsonAllOf1OwnerXbb6c0c43) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsTasksGetResponse200JsonAllOf1OwnerXbb6c0c43")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsTasksGetResponse200JsonAllOf1OwnerXbb6c0c43(block: InlineAgentsTasksGetResponse200JsonAllOf1OwnerXbb6c0c43.Builder.() -> Unit): InlineAgentsTasksGetResponse200JsonAllOf1OwnerXbb6c0c43 = InlineAgentsTasksGetResponse200JsonAllOf1OwnerXbb6c0c43.build(block)
