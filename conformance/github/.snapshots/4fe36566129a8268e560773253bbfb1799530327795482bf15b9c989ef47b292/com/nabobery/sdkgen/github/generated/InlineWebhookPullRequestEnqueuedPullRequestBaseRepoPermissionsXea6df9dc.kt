package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-enqueued/properties/pull_request/properties/bas
 * e/properties/repo/properties/permissions.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-enqueued/properties/pull_request/properties/bas
 * e/properties/repo/properties/permissions
 */
@Serializable(with = InlineWebhookPullRequestEnqueuedPullRequestBaseRepoPermissionsXea6df9dc.Serializer::class)
public class InlineWebhookPullRequestEnqueuedPullRequestBaseRepoPermissionsXea6df9dc(
  public val admin: Boolean,
  public val pull: Boolean,
  public val push: Boolean,
  public val maintain: Boolean? = null,
  public val triage: Boolean? = null,
) {
  public class Builder {
    private var adminValue: Boolean? = null

    public var admin: Boolean
      get() = requireNotNull(adminValue) { "admin is required" }
      set(`value`) {
        adminValue = value
      }

    private var pullValue: Boolean? = null

    public var pull: Boolean
      get() = requireNotNull(pullValue) { "pull is required" }
      set(`value`) {
        pullValue = value
      }

    private var pushValue: Boolean? = null

    public var push: Boolean
      get() = requireNotNull(pushValue) { "push is required" }
      set(`value`) {
        pushValue = value
      }

    public var maintain: Boolean? = null

    public var triage: Boolean? = null

    public fun build(): InlineWebhookPullRequestEnqueuedPullRequestBaseRepoPermissionsXea6df9dc {
      check(adminValue != null) { "admin is required" }
      check(pullValue != null) { "pull is required" }
      check(pushValue != null) { "push is required" }
      return InlineWebhookPullRequestEnqueuedPullRequestBaseRepoPermissionsXea6df9dc(
        admin = admin,
        pull = pull,
        push = push,
        maintain = maintain,
        triage = triage,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestEnqueuedPullRequestBaseRepoPermissionsXea6df9dc = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestEnqueuedPullRequestBaseRepoPermissionsXea6df9dc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestEnqueuedPullRequestBaseRepoPermissionsXea6df9dc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestEnqueuedPullRequestBaseRepoPermissionsXea6df9dc")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestEnqueuedPullRequestBaseRepoPermissionsXea6df9dc must be a JSON object")
      val admin = json.decodeRequired<Boolean>(rawObject, "admin")
      val pull = json.decodeRequired<Boolean>(rawObject, "pull")
      val push = json.decodeRequired<Boolean>(rawObject, "push")
      return InlineWebhookPullRequestEnqueuedPullRequestBaseRepoPermissionsXea6df9dc(
        admin = admin,
        pull = pull,
        push = push,
        maintain = rawObject["maintain"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        triage = rawObject["triage"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestEnqueuedPullRequestBaseRepoPermissionsXea6df9dc) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestEnqueuedPullRequestBaseRepoPermissionsXea6df9dc")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("admin", json.encodeToJsonElement(value.admin))
        put("pull", json.encodeToJsonElement(value.pull))
        put("push", json.encodeToJsonElement(value.push))
        value.maintain?.let { put("maintain", json.encodeToJsonElement(it)) }
        value.triage?.let { put("triage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestEnqueuedPullRequestBaseRepoPermissionsXea6df9dc(block: InlineWebhookPullRequestEnqueuedPullRequestBaseRepoPermissionsXea6df9dc.Builder.() -> Unit): InlineWebhookPullRequestEnqueuedPullRequestBaseRepoPermissionsXea6df9dc = InlineWebhookPullRequestEnqueuedPullRequestBaseRepoPermissionsXea6df9dc.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestEnqueuedPullRequestBaseRepoPermissionsXea6df9dc is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
