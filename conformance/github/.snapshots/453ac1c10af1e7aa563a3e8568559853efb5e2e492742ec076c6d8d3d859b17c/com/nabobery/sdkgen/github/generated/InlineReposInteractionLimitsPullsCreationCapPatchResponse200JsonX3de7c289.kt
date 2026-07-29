package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1interaction-limits~1pulls~1creation-cap/patch/responses
 * /200/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1interaction-limits~1pulls~1creation-cap/patch/responses
 * /200/content/application~1json/schema
 */
@Serializable(with = InlineReposInteractionLimitsPullsCreationCapPatchResponse200JsonX3de7c289.Serializer::class)
public class InlineReposInteractionLimitsPullsCreationCapPatchResponse200JsonX3de7c289(
  /**
   * Whether the pull request creation cap is enabled
   */
  public val enabled: Boolean,
  /**
   * The maximum number of open pull requests a user can have at one time
   */
  public val maxOpenPullRequests: Int,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    private var maxOpenPullRequestsValue: Int? = null

    public var maxOpenPullRequests: Int
      get() = requireNotNull(maxOpenPullRequestsValue) { "maxOpenPullRequests is required" }
      set(`value`) {
        maxOpenPullRequestsValue = value
      }

    public fun build(): InlineReposInteractionLimitsPullsCreationCapPatchResponse200JsonX3de7c289 {
      check(enabledValue != null) { "enabled is required" }
      check(maxOpenPullRequestsValue != null) { "maxOpenPullRequests is required" }
      return InlineReposInteractionLimitsPullsCreationCapPatchResponse200JsonX3de7c289(
        enabled = enabled,
        maxOpenPullRequests = maxOpenPullRequests,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposInteractionLimitsPullsCreationCapPatchResponse200JsonX3de7c289 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposInteractionLimitsPullsCreationCapPatchResponse200JsonX3de7c289> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposInteractionLimitsPullsCreationCapPatchResponse200JsonX3de7c289 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposInteractionLimitsPullsCreationCapPatchResponse200JsonX3de7c289")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposInteractionLimitsPullsCreationCapPatchResponse200JsonX3de7c289 must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      val maxOpenPullRequests = json.decodeRequired<Int>(rawObject, "max_open_pull_requests")
      return InlineReposInteractionLimitsPullsCreationCapPatchResponse200JsonX3de7c289(
        enabled = enabled,
        maxOpenPullRequests = maxOpenPullRequests,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposInteractionLimitsPullsCreationCapPatchResponse200JsonX3de7c289) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposInteractionLimitsPullsCreationCapPatchResponse200JsonX3de7c289")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        put("max_open_pull_requests", json.encodeToJsonElement(value.maxOpenPullRequests))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposInteractionLimitsPullsCreationCapPatchResponse200JsonX3de7c289(block: InlineReposInteractionLimitsPullsCreationCapPatchResponse200JsonX3de7c289.Builder.() -> Unit): InlineReposInteractionLimitsPullsCreationCapPatchResponse200JsonX3de7c289 = InlineReposInteractionLimitsPullsCreationCapPatchResponse200JsonX3de7c289.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposInteractionLimitsPullsCreationCapPatchResponse200JsonX3de7c289 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
