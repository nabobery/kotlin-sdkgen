package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1user~1codespaces~1{codespace_name}~1publish/post/requestBody/content/applicatio
 * n~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1user~1codespaces~1{codespace_name}~1publish/post/requestBody/content/applicatio
 * n~1json/schema
 */
@Serializable(with = InlineUserCodespacesPublishPostRequestJsonXd8022b6e.Serializer::class)
public class InlineUserCodespacesPublishPostRequestJsonXd8022b6e(
  /**
   * A name for the new repository.
   */
  public val name: String? = null,
  /**
   * Whether the new repository should be private.
   */
  public val `private`: Boolean? = null,
) {
  public class Builder {
    /**
     * A name for the new repository.
     */
    public var name: String? = null

    /**
     * Whether the new repository should be private.
     */
    public var `private`: Boolean? = null

    public fun build(): InlineUserCodespacesPublishPostRequestJsonXd8022b6e = InlineUserCodespacesPublishPostRequestJsonXd8022b6e(
      name = name,
      private = private,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUserCodespacesPublishPostRequestJsonXd8022b6e = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineUserCodespacesPublishPostRequestJsonXd8022b6e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUserCodespacesPublishPostRequestJsonXd8022b6e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUserCodespacesPublishPostRequestJsonXd8022b6e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUserCodespacesPublishPostRequestJsonXd8022b6e must be a JSON object")
      return InlineUserCodespacesPublishPostRequestJsonXd8022b6e(
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        private = rawObject["private"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUserCodespacesPublishPostRequestJsonXd8022b6e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUserCodespacesPublishPostRequestJsonXd8022b6e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.name?.let { put("name", it) }
        value.private?.let { put("private", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUserCodespacesPublishPostRequestJsonXd8022b6e(block: InlineUserCodespacesPublishPostRequestJsonXd8022b6e.Builder.() -> Unit): InlineUserCodespacesPublishPostRequestJsonXd8022b6e = InlineUserCodespacesPublishPostRequestJsonXd8022b6e.build(block)
