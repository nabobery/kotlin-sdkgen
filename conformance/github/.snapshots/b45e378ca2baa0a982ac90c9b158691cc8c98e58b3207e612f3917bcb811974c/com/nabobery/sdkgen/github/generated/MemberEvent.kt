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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/member-event.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/member-event
 */
@Serializable(with = MemberEvent.Serializer::class)
public class MemberEvent(
  public val action: String,
  public val member: SimpleUser,
) {
  public class Builder {
    private var actionValue: String? = null

    public var action: String
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var memberValue: SimpleUser? = null

    public var member: SimpleUser
      get() = requireNotNull(memberValue) { "member is required" }
      set(`value`) {
        memberValue = value
      }

    public fun build(): MemberEvent {
      check(actionValue != null) { "action is required" }
      check(memberValue != null) { "member is required" }
      return MemberEvent(
        action = action,
        member = member,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): MemberEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<MemberEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MemberEvent {
      val jsonDecoder = decoder.requireJsonDecoder("MemberEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("MemberEvent must be a JSON object")
      val action = json.decodeRequired<String>(rawObject, "action")
      val member = json.decodeRequired<SimpleUser>(rawObject, "member")
      return MemberEvent(
        action = action,
        member = member,
      )
    }

    override fun serialize(encoder: Encoder, `value`: MemberEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("MemberEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", value.action)
        put("member", json.encodeToJsonElement(value.member))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun memberEvent(block: MemberEvent.Builder.() -> Unit): MemberEvent = MemberEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("MemberEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
