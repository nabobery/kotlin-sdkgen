package com.nabobery.sdkgen.github.generated

import kotlin.Int
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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1attestations/post/responses/201/content/application~1js
 * on/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1attestations/post/responses/201/content/application~1js
 * on/schema
 */
@Serializable(with = InlineReposAttestationsPostResponse201JsonXb910b558.Serializer::class)
public class InlineReposAttestationsPostResponse201JsonXb910b558(
  /**
   * The ID of the attestation.
   */
  public val id: Int? = null,
) {
  public class Builder {
    /**
     * The ID of the attestation.
     */
    public var id: Int? = null

    public fun build(): InlineReposAttestationsPostResponse201JsonXb910b558 = InlineReposAttestationsPostResponse201JsonXb910b558(
      id = id,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposAttestationsPostResponse201JsonXb910b558 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposAttestationsPostResponse201JsonXb910b558> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposAttestationsPostResponse201JsonXb910b558 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposAttestationsPostResponse201JsonXb910b558")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposAttestationsPostResponse201JsonXb910b558 must be a JSON object")
      return InlineReposAttestationsPostResponse201JsonXb910b558(
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposAttestationsPostResponse201JsonXb910b558) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposAttestationsPostResponse201JsonXb910b558")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposAttestationsPostResponse201JsonXb910b558(block: InlineReposAttestationsPostResponse201JsonXb910b558.Builder.() -> Unit): InlineReposAttestationsPostResponse201JsonXb910b558 = InlineReposAttestationsPostResponse201JsonXb910b558.build(block)
