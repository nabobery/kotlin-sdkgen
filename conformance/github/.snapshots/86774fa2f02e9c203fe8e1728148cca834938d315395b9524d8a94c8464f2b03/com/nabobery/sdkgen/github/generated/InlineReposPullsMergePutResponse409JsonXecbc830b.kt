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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}~1merge/put/responses/409/content/a
 * pplication~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}~1merge/put/responses/409/content/a
 * pplication~1json/schema
 */
@Serializable(with = InlineReposPullsMergePutResponse409JsonXecbc830b.Serializer::class)
public class InlineReposPullsMergePutResponse409JsonXecbc830b(
  public val documentationUrl: String? = null,
  public val message: String? = null,
) {
  public class Builder {
    public var documentationUrl: String? = null

    public var message: String? = null

    public fun build(): InlineReposPullsMergePutResponse409JsonXecbc830b = InlineReposPullsMergePutResponse409JsonXecbc830b(
      documentationUrl = documentationUrl,
      message = message,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposPullsMergePutResponse409JsonXecbc830b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposPullsMergePutResponse409JsonXecbc830b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposPullsMergePutResponse409JsonXecbc830b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposPullsMergePutResponse409JsonXecbc830b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposPullsMergePutResponse409JsonXecbc830b must be a JSON object")
      return InlineReposPullsMergePutResponse409JsonXecbc830b(
        documentationUrl = rawObject["documentation_url"]?.let { json.decodeFromJsonElement<String>(it) },
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposPullsMergePutResponse409JsonXecbc830b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposPullsMergePutResponse409JsonXecbc830b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.documentationUrl?.let { put("documentation_url", it) }
        value.message?.let { put("message", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposPullsMergePutResponse409JsonXecbc830b(block: InlineReposPullsMergePutResponse409JsonXecbc830b.Builder.() -> Unit): InlineReposPullsMergePutResponse409JsonXecbc830b = InlineReposPullsMergePutResponse409JsonXecbc830b.build(block)
