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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/repository-advisory/properties/submission.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-advisory/properties/submission
 */
@Serializable(with = InlineRepositoryAdvisorySubmissionXc91a0da7.Serializer::class)
public class InlineRepositoryAdvisorySubmissionXc91a0da7(
  /**
   * Whether a private vulnerability report was accepted by the repository's administrators.
   */
  public val accepted: Boolean,
) {
  public class Builder {
    private var acceptedValue: Boolean? = null

    public var accepted: Boolean
      get() = requireNotNull(acceptedValue) { "accepted is required" }
      set(`value`) {
        acceptedValue = value
      }

    public fun build(): InlineRepositoryAdvisorySubmissionXc91a0da7 {
      check(acceptedValue != null) { "accepted is required" }
      return InlineRepositoryAdvisorySubmissionXc91a0da7(
        accepted = accepted,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryAdvisorySubmissionXc91a0da7 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineRepositoryAdvisorySubmissionXc91a0da7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryAdvisorySubmissionXc91a0da7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryAdvisorySubmissionXc91a0da7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryAdvisorySubmissionXc91a0da7 must be a JSON object")
      val accepted = json.decodeRequired<Boolean>(rawObject, "accepted")
      return InlineRepositoryAdvisorySubmissionXc91a0da7(
        accepted = accepted,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryAdvisorySubmissionXc91a0da7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryAdvisorySubmissionXc91a0da7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("accepted", json.encodeToJsonElement(value.accepted))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryAdvisorySubmissionXc91a0da7(block: InlineRepositoryAdvisorySubmissionXc91a0da7.Builder.() -> Unit): InlineRepositoryAdvisorySubmissionXc91a0da7 = InlineRepositoryAdvisorySubmissionXc91a0da7.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineRepositoryAdvisorySubmissionXc91a0da7 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
