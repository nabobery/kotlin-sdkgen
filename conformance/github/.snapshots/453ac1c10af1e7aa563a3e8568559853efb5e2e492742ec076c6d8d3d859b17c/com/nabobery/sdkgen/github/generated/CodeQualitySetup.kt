package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Configuration for code quality setup.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-quality-setup
 */
@Serializable(with = CodeQualitySetup.Serializer::class)
public class CodeQualitySetup(
  languages: List<InlineCodeQualitySetupLanguagesItemXf18f2ebd>? = null,
  /**
   * Runner label to be used if the runner type is labeled.
   */
  public val runnerLabel: String? = null,
  /**
   * Runner type to be used.
   */
  public val runnerType: InlineCodeQualitySetupRunnerTypeX186aa28c? = null,
  /**
   * The frequency of the periodic analysis.
   */
  public val schedule: InlineCodeQualitySetupScheduleX559f612d? = null,
  /**
   * Code quality setup has been configured or not.
   */
  public val state: InlineCodeQualitySetupStateX9853e72e? = null,
  /**
   * Timestamp of latest configuration update.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String? = null,
) {
  /**
   * Languages to be analyzed.
   */
  public val languages: List<InlineCodeQualitySetupLanguagesItemXf18f2ebd>? =
      languages?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var languagesValue: List<InlineCodeQualitySetupLanguagesItemXf18f2ebd>? = null

    /**
     * Languages to be analyzed.
     */
    public var languages: List<InlineCodeQualitySetupLanguagesItemXf18f2ebd>?
      get() = languagesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        languagesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Runner label to be used if the runner type is labeled.
     */
    public var runnerLabel: String? = null

    /**
     * Runner type to be used.
     */
    public var runnerType: InlineCodeQualitySetupRunnerTypeX186aa28c? = null

    /**
     * The frequency of the periodic analysis.
     */
    public var schedule: InlineCodeQualitySetupScheduleX559f612d? = null

    /**
     * Code quality setup has been configured or not.
     */
    public var state: InlineCodeQualitySetupStateX9853e72e? = null

    /**
     * Timestamp of latest configuration update.
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var updatedAt: String? = null

    public fun build(): CodeQualitySetup = CodeQualitySetup(
      languages = languages,
      runnerLabel = runnerLabel,
      runnerType = runnerType,
      schedule = schedule,
      state = state,
      updatedAt = updatedAt,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodeQualitySetup = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CodeQualitySetup> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodeQualitySetup {
      val jsonDecoder = decoder.requireJsonDecoder("CodeQualitySetup")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodeQualitySetup must be a JSON object")
      return CodeQualitySetup(
        languages = rawObject["languages"]?.let { json.decodeFromJsonElement<List<InlineCodeQualitySetupLanguagesItemXf18f2ebd>>(it) },
        runnerLabel = rawObject["runner_label"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        runnerType = rawObject["runner_type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCodeQualitySetupRunnerTypeX186aa28c?>(element) },
        schedule = rawObject["schedule"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCodeQualitySetupScheduleX559f612d?>(element) },
        state = rawObject["state"]?.let { json.decodeFromJsonElement<InlineCodeQualitySetupStateX9853e72e>(it) },
        updatedAt = rawObject["updated_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodeQualitySetup) {
      val jsonEncoder = encoder.requireJsonEncoder("CodeQualitySetup")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.languages?.let { put("languages", json.encodeToJsonElement(it)) }
        value.runnerLabel?.let { put("runner_label", it) }
        value.runnerType?.let { put("runner_type", json.encodeToJsonElement(it)) }
        value.schedule?.let { put("schedule", json.encodeToJsonElement(it)) }
        value.state?.let { put("state", json.encodeToJsonElement(it)) }
        value.updatedAt?.let { put("updated_at", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codeQualitySetup(block: CodeQualitySetup.Builder.() -> Unit): CodeQualitySetup = CodeQualitySetup.build(block)
