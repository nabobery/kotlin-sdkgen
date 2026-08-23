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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1environments~1{environment_name}/put/requestBody/conten
 * t/application~1json/schema/properties/reviewers/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1environments~1{environment_name}/put/requestBody/conten
 * t/application~1json/schema/properties/reviewers/items
 */
@Serializable(with = InlineReposEnvironmentsPutRequestJsonReviewersItemX041a4969.Serializer::class)
public class InlineReposEnvironmentsPutRequestJsonReviewersItemX041a4969(
  /**
   * The id of the user or team who can review the deployment
   */
  public val id: Int? = null,
  public val type: DeploymentReviewerType? = null,
) {
  public class Builder {
    /**
     * The id of the user or team who can review the deployment
     */
    public var id: Int? = null

    public var type: DeploymentReviewerType? = null

    public fun build(): InlineReposEnvironmentsPutRequestJsonReviewersItemX041a4969 = InlineReposEnvironmentsPutRequestJsonReviewersItemX041a4969(
      id = id,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposEnvironmentsPutRequestJsonReviewersItemX041a4969 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposEnvironmentsPutRequestJsonReviewersItemX041a4969> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposEnvironmentsPutRequestJsonReviewersItemX041a4969 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposEnvironmentsPutRequestJsonReviewersItemX041a4969")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposEnvironmentsPutRequestJsonReviewersItemX041a4969 must be a JSON object")
      return InlineReposEnvironmentsPutRequestJsonReviewersItemX041a4969(
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<DeploymentReviewerType>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposEnvironmentsPutRequestJsonReviewersItemX041a4969) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposEnvironmentsPutRequestJsonReviewersItemX041a4969")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposEnvironmentsPutRequestJsonReviewersItemX041a4969(block: InlineReposEnvironmentsPutRequestJsonReviewersItemX041a4969.Builder.() -> Unit): InlineReposEnvironmentsPutRequestJsonReviewersItemX041a4969 = InlineReposEnvironmentsPutRequestJsonReviewersItemX041a4969.build(block)
