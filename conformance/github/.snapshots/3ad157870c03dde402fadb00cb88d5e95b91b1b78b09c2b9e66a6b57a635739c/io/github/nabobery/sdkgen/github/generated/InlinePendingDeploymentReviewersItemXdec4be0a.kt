package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/pending-deployment/properties/reviewers/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/pending-deployment/properties/reviewers/items
 */
@Serializable(with = InlinePendingDeploymentReviewersItemXdec4be0a.Serializer::class)
public class InlinePendingDeploymentReviewersItemXdec4be0a(
  public val reviewer: InlinePendingDeploymentReviewersItemReviewerX28b4a764? = null,
  public val type: DeploymentReviewerType? = null,
) {
  public class Builder {
    public var reviewer: InlinePendingDeploymentReviewersItemReviewerX28b4a764? = null

    public var type: DeploymentReviewerType? = null

    public fun build(): InlinePendingDeploymentReviewersItemXdec4be0a = InlinePendingDeploymentReviewersItemXdec4be0a(
      reviewer = reviewer,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePendingDeploymentReviewersItemXdec4be0a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlinePendingDeploymentReviewersItemXdec4be0a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePendingDeploymentReviewersItemXdec4be0a {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePendingDeploymentReviewersItemXdec4be0a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlinePendingDeploymentReviewersItemXdec4be0a must be a JSON object")
      return InlinePendingDeploymentReviewersItemXdec4be0a(
        reviewer = rawObject["reviewer"]?.let { json.decodeFromJsonElement<InlinePendingDeploymentReviewersItemReviewerX28b4a764>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<DeploymentReviewerType>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePendingDeploymentReviewersItemXdec4be0a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePendingDeploymentReviewersItemXdec4be0a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.reviewer?.let { put("reviewer", json.encodeToJsonElement(it)) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePendingDeploymentReviewersItemXdec4be0a(block: InlinePendingDeploymentReviewersItemXdec4be0a.Builder.() -> Unit): InlinePendingDeploymentReviewersItemXdec4be0a = InlinePendingDeploymentReviewersItemXdec4be0a.build(block)
