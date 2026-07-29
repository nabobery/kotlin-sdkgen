package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
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
 * The configuration for iteration fields.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/projects-v2-field-iteration-configuration
 */
@Serializable(with = ProjectsV2FieldIterationConfiguration.Serializer::class)
public class ProjectsV2FieldIterationConfiguration(
  /**
   * The default duration for iterations in days. Individual iterations can override this value.
   */
  public val duration: Int? = null,
  iterations: List<InlineProjectsV2FieldIterationConfigurationIterationsItemX14225bde>? = null,
  /**
   * The start date of the first iteration.
   *
   * Wire format: `date`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val startDate: String? = null,
) {
  /**
   * Zero or more iterations for the field.
   */
  public val iterations: List<InlineProjectsV2FieldIterationConfigurationIterationsItemX14225bde>? =
      iterations?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * The default duration for iterations in days. Individual iterations can override this value.
     */
    public var duration: Int? = null

    private var iterationsValue:
        List<InlineProjectsV2FieldIterationConfigurationIterationsItemX14225bde>? = null

    /**
     * Zero or more iterations for the field.
     */
    public var iterations: List<InlineProjectsV2FieldIterationConfigurationIterationsItemX14225bde>?
      get() = iterationsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        iterationsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The start date of the first iteration.
     *
     * Wire format: `date`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var startDate: String? = null

    public fun build(): ProjectsV2FieldIterationConfiguration = ProjectsV2FieldIterationConfiguration(
      duration = duration,
      iterations = iterations,
      startDate = startDate,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ProjectsV2FieldIterationConfiguration = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ProjectsV2FieldIterationConfiguration> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ProjectsV2FieldIterationConfiguration {
      val jsonDecoder = decoder.requireJsonDecoder("ProjectsV2FieldIterationConfiguration")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ProjectsV2FieldIterationConfiguration must be a JSON object")
      return ProjectsV2FieldIterationConfiguration(
        duration = rawObject["duration"]?.let { json.decodeFromJsonElement<Int>(it) },
        iterations = rawObject["iterations"]?.let { json.decodeFromJsonElement<List<InlineProjectsV2FieldIterationConfigurationIterationsItemX14225bde>>(it) },
        startDate = rawObject["start_date"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ProjectsV2FieldIterationConfiguration) {
      val jsonEncoder = encoder.requireJsonEncoder("ProjectsV2FieldIterationConfiguration")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.duration?.let { put("duration", json.encodeToJsonElement(it)) }
        value.iterations?.let { put("iterations", json.encodeToJsonElement(it)) }
        value.startDate?.let { put("start_date", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun projectsV2FieldIterationConfiguration(block: ProjectsV2FieldIterationConfiguration.Builder.() -> Unit): ProjectsV2FieldIterationConfiguration = ProjectsV2FieldIterationConfiguration.build(block)
