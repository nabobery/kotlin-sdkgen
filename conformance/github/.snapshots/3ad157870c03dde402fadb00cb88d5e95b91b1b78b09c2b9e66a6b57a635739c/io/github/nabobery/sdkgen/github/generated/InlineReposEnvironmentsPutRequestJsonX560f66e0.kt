package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1environments~1{environment_name}/put/requestBody/conten
 * t/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1environments~1{environment_name}/put/requestBody/conten
 * t/application~1json/schema
 */
@Serializable(with = InlineReposEnvironmentsPutRequestJsonX560f66e0.Serializer::class)
public class InlineReposEnvironmentsPutRequestJsonX560f66e0(
  public val deploymentBranchPolicy: DeploymentBranchPolicySettings? = null,
  public val preventSelfReview: Boolean? = null,
  reviewers: List<InlineReposEnvironmentsPutRequestJsonReviewersItemX041a4969>? = null,
  public val waitTimer: Int? = null,
) {
  /**
   * The people or teams that may review jobs that reference the environment. You can list up to six users or teams as
   * reviewers. The reviewers must have at least read access to the repository. Only one of the required reviewers needs
   * to approve the job for it to proceed.
   */
  public val reviewers: List<InlineReposEnvironmentsPutRequestJsonReviewersItemX041a4969>? =
      reviewers?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var deploymentBranchPolicy: DeploymentBranchPolicySettings? = null

    public var preventSelfReview: Boolean? = null

    private var reviewersValue: List<InlineReposEnvironmentsPutRequestJsonReviewersItemX041a4969>? =
        null

    /**
     * The people or teams that may review jobs that reference the environment. You can list up to six users or teams as
     * reviewers. The reviewers must have at least read access to the repository. Only one of the required reviewers
     * needs to approve the job for it to proceed.
     */
    public var reviewers: List<InlineReposEnvironmentsPutRequestJsonReviewersItemX041a4969>?
      get() = reviewersValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        reviewersValue = value?.let { collection0 -> collection0.toList() }
      }

    public var waitTimer: Int? = null

    public fun build(): InlineReposEnvironmentsPutRequestJsonX560f66e0 = InlineReposEnvironmentsPutRequestJsonX560f66e0(
      deploymentBranchPolicy = deploymentBranchPolicy,
      preventSelfReview = preventSelfReview,
      reviewers = reviewers,
      waitTimer = waitTimer,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposEnvironmentsPutRequestJsonX560f66e0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposEnvironmentsPutRequestJsonX560f66e0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposEnvironmentsPutRequestJsonX560f66e0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposEnvironmentsPutRequestJsonX560f66e0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposEnvironmentsPutRequestJsonX560f66e0 must be a JSON object")
      return InlineReposEnvironmentsPutRequestJsonX560f66e0(
        deploymentBranchPolicy = rawObject["deployment_branch_policy"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<DeploymentBranchPolicySettings?>(element) },
        preventSelfReview = rawObject["prevent_self_review"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        reviewers = rawObject["reviewers"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineReposEnvironmentsPutRequestJsonReviewersItemX041a4969>?>(element) },
        waitTimer = rawObject["wait_timer"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposEnvironmentsPutRequestJsonX560f66e0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposEnvironmentsPutRequestJsonX560f66e0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.deploymentBranchPolicy?.let { put("deployment_branch_policy", json.encodeToJsonElement(it)) }
        value.preventSelfReview?.let { put("prevent_self_review", json.encodeToJsonElement(it)) }
        value.reviewers?.let { put("reviewers", json.encodeToJsonElement(it)) }
        value.waitTimer?.let { put("wait_timer", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposEnvironmentsPutRequestJsonX560f66e0(block: InlineReposEnvironmentsPutRequestJsonX560f66e0.Builder.() -> Unit): InlineReposEnvironmentsPutRequestJsonX560f66e0 = InlineReposEnvironmentsPutRequestJsonX560f66e0.build(block)
