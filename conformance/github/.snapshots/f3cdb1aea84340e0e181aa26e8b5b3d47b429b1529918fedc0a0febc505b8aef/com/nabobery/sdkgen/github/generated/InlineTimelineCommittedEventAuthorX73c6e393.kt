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
import kotlinx.serialization.json.put

/**
 * Identifying information for the git-user
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/timeline-committed-event/properties/author
 */
@Serializable(with = InlineTimelineCommittedEventAuthorX73c6e393.Serializer::class)
public class InlineTimelineCommittedEventAuthorX73c6e393(
  /**
   * Timestamp of the commit
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val date: String,
  /**
   * Git email address of the user
   */
  public val email: String,
  /**
   * Name of the git user
   */
  public val name: String,
) {
  public class Builder {
    private var dateValue: String? = null

    public var date: String
      get() = requireNotNull(dateValue) { "date is required" }
      set(`value`) {
        dateValue = value
      }

    private var emailValue: String? = null

    public var email: String
      get() = requireNotNull(emailValue) { "email is required" }
      set(`value`) {
        emailValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public fun build(): InlineTimelineCommittedEventAuthorX73c6e393 {
      check(dateValue != null) { "date is required" }
      check(emailValue != null) { "email is required" }
      check(nameValue != null) { "name is required" }
      return InlineTimelineCommittedEventAuthorX73c6e393(
        date = date,
        email = email,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineTimelineCommittedEventAuthorX73c6e393 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineTimelineCommittedEventAuthorX73c6e393> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTimelineCommittedEventAuthorX73c6e393 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTimelineCommittedEventAuthorX73c6e393")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineTimelineCommittedEventAuthorX73c6e393 must be a JSON object")
      val date = json.decodeRequired<String>(rawObject, "date")
      val email = json.decodeRequired<String>(rawObject, "email")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineTimelineCommittedEventAuthorX73c6e393(
        date = date,
        email = email,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineTimelineCommittedEventAuthorX73c6e393) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineTimelineCommittedEventAuthorX73c6e393")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("date", value.date)
        put("email", value.email)
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineTimelineCommittedEventAuthorX73c6e393(block: InlineTimelineCommittedEventAuthorX73c6e393.Builder.() -> Unit): InlineTimelineCommittedEventAuthorX73c6e393 = InlineTimelineCommittedEventAuthorX73c6e393.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineTimelineCommittedEventAuthorX73c6e393 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
