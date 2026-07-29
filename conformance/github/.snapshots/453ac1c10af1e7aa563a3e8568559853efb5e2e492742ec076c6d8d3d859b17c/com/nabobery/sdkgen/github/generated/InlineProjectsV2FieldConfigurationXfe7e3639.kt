package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Configuration for iteration fields.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/projects-v2-field/properties/configuration
 */
@Serializable(with = InlineProjectsV2FieldConfigurationXfe7e3639.Serializer::class)
public class InlineProjectsV2FieldConfigurationXfe7e3639(
  /**
   * The duration of the iteration in days.
   */
  public val duration: Int? = null,
  iterations: List<ProjectsV2IterationSettings>? = null,
  /**
   * The day of the week when the iteration starts.
   */
  public val startDay: Int? = null,
) {
  public val iterations: List<ProjectsV2IterationSettings>? =
      iterations?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * The duration of the iteration in days.
     */
    public var duration: Int? = null

    private var iterationsValue: List<ProjectsV2IterationSettings>? = null

    public var iterations: List<ProjectsV2IterationSettings>?
      get() = iterationsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        iterationsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The day of the week when the iteration starts.
     */
    public var startDay: Int? = null

    public fun build(): InlineProjectsV2FieldConfigurationXfe7e3639 = InlineProjectsV2FieldConfigurationXfe7e3639(
      duration = duration,
      iterations = iterations,
      startDay = startDay,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineProjectsV2FieldConfigurationXfe7e3639 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineProjectsV2FieldConfigurationXfe7e3639> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineProjectsV2FieldConfigurationXfe7e3639 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineProjectsV2FieldConfigurationXfe7e3639")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineProjectsV2FieldConfigurationXfe7e3639 must be a JSON object")
      return InlineProjectsV2FieldConfigurationXfe7e3639(
        duration = rawObject["duration"]?.let { json.decodeFromJsonElement<Int>(it) },
        iterations = rawObject["iterations"]?.let { json.decodeFromJsonElement<List<ProjectsV2IterationSettings>>(it) },
        startDay = rawObject["start_day"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineProjectsV2FieldConfigurationXfe7e3639) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineProjectsV2FieldConfigurationXfe7e3639")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.duration?.let { put("duration", json.encodeToJsonElement(it)) }
        value.iterations?.let { put("iterations", json.encodeToJsonElement(it)) }
        value.startDay?.let { put("start_day", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineProjectsV2FieldConfigurationXfe7e3639(block: InlineProjectsV2FieldConfigurationXfe7e3639.Builder.() -> Unit): InlineProjectsV2FieldConfigurationXfe7e3639 = InlineProjectsV2FieldConfigurationXfe7e3639.build(block)
