package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-edited/properties/changes/properties/base.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-edited/properties/changes/properties/base
 */
@Serializable(with = InlineWebhookPullRequestEditedChangesBaseX208d22c2.Serializer::class)
public class InlineWebhookPullRequestEditedChangesBaseX208d22c2(
  public val ref: InlineWebhookPullRequestEditedChangesBaseRefX26f12ba1,
  public val sha: InlineWebhookPullRequestEditedChangesBaseShaXeae0d684,
) {
  public class Builder {
    private var refValue: InlineWebhookPullRequestEditedChangesBaseRefX26f12ba1? = null

    public var ref: InlineWebhookPullRequestEditedChangesBaseRefX26f12ba1
      get() = requireNotNull(refValue) { "ref is required" }
      set(`value`) {
        refValue = value
      }

    private var shaValue: InlineWebhookPullRequestEditedChangesBaseShaXeae0d684? = null

    public var sha: InlineWebhookPullRequestEditedChangesBaseShaXeae0d684
      get() = requireNotNull(shaValue) { "sha is required" }
      set(`value`) {
        shaValue = value
      }

    public fun build(): InlineWebhookPullRequestEditedChangesBaseX208d22c2 {
      check(refValue != null) { "ref is required" }
      check(shaValue != null) { "sha is required" }
      return InlineWebhookPullRequestEditedChangesBaseX208d22c2(
        ref = ref,
        sha = sha,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestEditedChangesBaseX208d22c2 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestEditedChangesBaseX208d22c2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestEditedChangesBaseX208d22c2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestEditedChangesBaseX208d22c2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestEditedChangesBaseX208d22c2 must be a JSON object")
      val ref = json.decodeRequired<InlineWebhookPullRequestEditedChangesBaseRefX26f12ba1>(rawObject, "ref")
      val sha = json.decodeRequired<InlineWebhookPullRequestEditedChangesBaseShaXeae0d684>(rawObject, "sha")
      return InlineWebhookPullRequestEditedChangesBaseX208d22c2(
        ref = ref,
        sha = sha,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestEditedChangesBaseX208d22c2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestEditedChangesBaseX208d22c2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("ref", json.encodeToJsonElement(value.ref))
        put("sha", json.encodeToJsonElement(value.sha))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestEditedChangesBaseX208d22c2(block: InlineWebhookPullRequestEditedChangesBaseX208d22c2.Builder.() -> Unit): InlineWebhookPullRequestEditedChangesBaseX208d22c2 = InlineWebhookPullRequestEditedChangesBaseX208d22c2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestEditedChangesBaseX208d22c2 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
