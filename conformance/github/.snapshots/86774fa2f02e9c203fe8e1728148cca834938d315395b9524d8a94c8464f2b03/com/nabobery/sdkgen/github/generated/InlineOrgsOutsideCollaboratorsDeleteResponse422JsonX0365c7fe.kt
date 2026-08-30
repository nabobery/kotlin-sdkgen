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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1outside_collaborators~1{username}/delete/responses/422/content/app
 * lication~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1outside_collaborators~1{username}/delete/responses/422/content/app
 * lication~1json/schema
 */
@Serializable(with = InlineOrgsOutsideCollaboratorsDeleteResponse422JsonX0365c7fe.Serializer::class)
public class InlineOrgsOutsideCollaboratorsDeleteResponse422JsonX0365c7fe(
  public val documentationUrl: String? = null,
  public val message: String? = null,
) {
  public class Builder {
    public var documentationUrl: String? = null

    public var message: String? = null

    public fun build(): InlineOrgsOutsideCollaboratorsDeleteResponse422JsonX0365c7fe = InlineOrgsOutsideCollaboratorsDeleteResponse422JsonX0365c7fe(
      documentationUrl = documentationUrl,
      message = message,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsOutsideCollaboratorsDeleteResponse422JsonX0365c7fe = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsOutsideCollaboratorsDeleteResponse422JsonX0365c7fe> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsOutsideCollaboratorsDeleteResponse422JsonX0365c7fe {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsOutsideCollaboratorsDeleteResponse422JsonX0365c7fe")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsOutsideCollaboratorsDeleteResponse422JsonX0365c7fe must be a JSON object")
      return InlineOrgsOutsideCollaboratorsDeleteResponse422JsonX0365c7fe(
        documentationUrl = rawObject["documentation_url"]?.let { json.decodeFromJsonElement<String>(it) },
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsOutsideCollaboratorsDeleteResponse422JsonX0365c7fe) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsOutsideCollaboratorsDeleteResponse422JsonX0365c7fe")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.documentationUrl?.let { put("documentation_url", it) }
        value.message?.let { put("message", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsOutsideCollaboratorsDeleteResponse422JsonX0365c7fe(block: InlineOrgsOutsideCollaboratorsDeleteResponse422JsonX0365c7fe.Builder.() -> Unit): InlineOrgsOutsideCollaboratorsDeleteResponse422JsonX0365c7fe = InlineOrgsOutsideCollaboratorsDeleteResponse422JsonX0365c7fe.build(block)
