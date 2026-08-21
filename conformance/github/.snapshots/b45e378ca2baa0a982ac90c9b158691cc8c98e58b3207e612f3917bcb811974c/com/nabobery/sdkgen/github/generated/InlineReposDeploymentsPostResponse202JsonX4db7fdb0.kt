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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1deployments/post/responses/202/content/application~1jso
 * n/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1deployments/post/responses/202/content/application~1jso
 * n/schema
 */
@Serializable(with = InlineReposDeploymentsPostResponse202JsonX4db7fdb0.Serializer::class)
public class InlineReposDeploymentsPostResponse202JsonX4db7fdb0(
  public val message: String? = null,
) {
  public class Builder {
    public var message: String? = null

    public fun build(): InlineReposDeploymentsPostResponse202JsonX4db7fdb0 = InlineReposDeploymentsPostResponse202JsonX4db7fdb0(
      message = message,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposDeploymentsPostResponse202JsonX4db7fdb0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposDeploymentsPostResponse202JsonX4db7fdb0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposDeploymentsPostResponse202JsonX4db7fdb0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposDeploymentsPostResponse202JsonX4db7fdb0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposDeploymentsPostResponse202JsonX4db7fdb0 must be a JSON object")
      return InlineReposDeploymentsPostResponse202JsonX4db7fdb0(
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposDeploymentsPostResponse202JsonX4db7fdb0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposDeploymentsPostResponse202JsonX4db7fdb0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.message?.let { put("message", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposDeploymentsPostResponse202JsonX4db7fdb0(block: InlineReposDeploymentsPostResponse202JsonX4db7fdb0.Builder.() -> Unit): InlineReposDeploymentsPostResponse202JsonX4db7fdb0 = InlineReposDeploymentsPostResponse202JsonX4db7fdb0.build(block)
