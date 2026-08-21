package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1outside_collaborators~1{username}/put/requestBody/content/applicat
 * ion~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1outside_collaborators~1{username}/put/requestBody/content/applicat
 * ion~1json/schema
 */
@Serializable(with = InlineOrgsOutsideCollaboratorsPutRequestJsonX344bc02b.Serializer::class)
public class InlineOrgsOutsideCollaboratorsPutRequestJsonX344bc02b(
  /**
   * When set to `true`, the request will be performed asynchronously. Returns a 202 status code when the job is
   * successfully queued.
   */
  public val async: Boolean? = null,
) {
  public class Builder {
    /**
     * When set to `true`, the request will be performed asynchronously. Returns a 202 status code when the job is
     * successfully queued.
     */
    public var async: Boolean? = null

    public fun build(): InlineOrgsOutsideCollaboratorsPutRequestJsonX344bc02b = InlineOrgsOutsideCollaboratorsPutRequestJsonX344bc02b(
      async = async,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsOutsideCollaboratorsPutRequestJsonX344bc02b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsOutsideCollaboratorsPutRequestJsonX344bc02b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsOutsideCollaboratorsPutRequestJsonX344bc02b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsOutsideCollaboratorsPutRequestJsonX344bc02b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsOutsideCollaboratorsPutRequestJsonX344bc02b must be a JSON object")
      return InlineOrgsOutsideCollaboratorsPutRequestJsonX344bc02b(
        async = rawObject["async"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsOutsideCollaboratorsPutRequestJsonX344bc02b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsOutsideCollaboratorsPutRequestJsonX344bc02b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.async?.let { put("async", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsOutsideCollaboratorsPutRequestJsonX344bc02b(block: InlineOrgsOutsideCollaboratorsPutRequestJsonX344bc02b.Builder.() -> Unit): InlineOrgsOutsideCollaboratorsPutRequestJsonX344bc02b = InlineOrgsOutsideCollaboratorsPutRequestJsonX344bc02b.build(block)
