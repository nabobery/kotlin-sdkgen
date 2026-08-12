package com.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/push-event.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/push-event
 */
@Serializable(with = PushEvent.Serializer::class)
public class PushEvent(
  public val before: String,
  public val head: String,
  public val pushId: Int,
  public val ref: String,
  public val repositoryId: Int,
) {
  public class Builder {
    private var beforeValue: String? = null

    public var before: String
      get() = requireNotNull(beforeValue) { "before is required" }
      set(`value`) {
        beforeValue = value
      }

    private var headValue: String? = null

    public var head: String
      get() = requireNotNull(headValue) { "head is required" }
      set(`value`) {
        headValue = value
      }

    private var pushIdValue: Int? = null

    public var pushId: Int
      get() = requireNotNull(pushIdValue) { "pushId is required" }
      set(`value`) {
        pushIdValue = value
      }

    private var refValue: String? = null

    public var ref: String
      get() = requireNotNull(refValue) { "ref is required" }
      set(`value`) {
        refValue = value
      }

    private var repositoryIdValue: Int? = null

    public var repositoryId: Int
      get() = requireNotNull(repositoryIdValue) { "repositoryId is required" }
      set(`value`) {
        repositoryIdValue = value
      }

    public fun build(): PushEvent {
      check(beforeValue != null) { "before is required" }
      check(headValue != null) { "head is required" }
      check(pushIdValue != null) { "pushId is required" }
      check(refValue != null) { "ref is required" }
      check(repositoryIdValue != null) { "repositoryId is required" }
      return PushEvent(
        before = before,
        head = head,
        pushId = pushId,
        ref = ref,
        repositoryId = repositoryId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PushEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PushEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PushEvent {
      val jsonDecoder = decoder.requireJsonDecoder("PushEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PushEvent must be a JSON object")
      val before = json.decodeRequired<String>(rawObject, "before")
      val head = json.decodeRequired<String>(rawObject, "head")
      val pushId = json.decodeRequired<Int>(rawObject, "push_id")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val repositoryId = json.decodeRequired<Int>(rawObject, "repository_id")
      return PushEvent(
        before = before,
        head = head,
        pushId = pushId,
        ref = ref,
        repositoryId = repositoryId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PushEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("PushEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("before", value.before)
        put("head", value.head)
        put("push_id", json.encodeToJsonElement(value.pushId))
        put("ref", value.ref)
        put("repository_id", json.encodeToJsonElement(value.repositoryId))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun pushEvent(block: PushEvent.Builder.() -> Unit): PushEvent = PushEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PushEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
