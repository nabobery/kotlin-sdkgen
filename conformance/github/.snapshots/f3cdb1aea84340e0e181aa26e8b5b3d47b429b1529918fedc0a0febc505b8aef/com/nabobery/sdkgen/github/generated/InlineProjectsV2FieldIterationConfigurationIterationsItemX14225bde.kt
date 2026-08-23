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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/projects-v2-field-iteration-configuration/properties/iterations/item
 * s.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/projects-v2-field-iteration-configuration/properties/iterations/item
 * s
 */
@Serializable(with = InlineProjectsV2FieldIterationConfigurationIterationsItemX14225bde.Serializer::class)
public class InlineProjectsV2FieldIterationConfigurationIterationsItemX14225bde(
  /**
   * The duration of the iteration in days.
   */
  public val duration: Int? = null,
  /**
   * The start date of the iteration.
   *
   * Wire format: `date`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val startDate: String? = null,
  /**
   * The title of the iteration.
   */
  public val title: String? = null,
) {
  public class Builder {
    /**
     * The duration of the iteration in days.
     */
    public var duration: Int? = null

    /**
     * The start date of the iteration.
     *
     * Wire format: `date`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var startDate: String? = null

    /**
     * The title of the iteration.
     */
    public var title: String? = null

    public fun build(): InlineProjectsV2FieldIterationConfigurationIterationsItemX14225bde = InlineProjectsV2FieldIterationConfigurationIterationsItemX14225bde(
      duration = duration,
      startDate = startDate,
      title = title,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineProjectsV2FieldIterationConfigurationIterationsItemX14225bde = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineProjectsV2FieldIterationConfigurationIterationsItemX14225bde> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineProjectsV2FieldIterationConfigurationIterationsItemX14225bde {
      val jsonDecoder = decoder.requireJsonDecoder("InlineProjectsV2FieldIterationConfigurationIterationsItemX14225bde")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineProjectsV2FieldIterationConfigurationIterationsItemX14225bde must be a JSON object")
      return InlineProjectsV2FieldIterationConfigurationIterationsItemX14225bde(
        duration = rawObject["duration"]?.let { json.decodeFromJsonElement<Int>(it) },
        startDate = rawObject["start_date"]?.let { json.decodeFromJsonElement<String>(it) },
        title = rawObject["title"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineProjectsV2FieldIterationConfigurationIterationsItemX14225bde) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineProjectsV2FieldIterationConfigurationIterationsItemX14225bde")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.duration?.let { put("duration", json.encodeToJsonElement(it)) }
        value.startDate?.let { put("start_date", it) }
        value.title?.let { put("title", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineProjectsV2FieldIterationConfigurationIterationsItemX14225bde(block: InlineProjectsV2FieldIterationConfigurationIterationsItemX14225bde.Builder.() -> Unit): InlineProjectsV2FieldIterationConfigurationIterationsItemX14225bde = InlineProjectsV2FieldIterationConfigurationIterationsItemX14225bde.build(block)
