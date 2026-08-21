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
 * Configuration for code scanning default setup.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-default-setup
 */
@Serializable(with = CodeScanningDefaultSetup.Serializer::class)
public class CodeScanningDefaultSetup(
  languages: List<InlineCodeScanningDefaultSetupLanguagesItemX217a66c2>? = null,
  /**
   * CodeQL query suite to be used.
   */
  public val querySuite: InlineCodeScanningDefaultSetupQuerySuiteX99e920ab? = null,
  /**
   * Runner label to be used if the runner type is labeled.
   */
  public val runnerLabel: String? = null,
  /**
   * Runner type to be used.
   */
  public val runnerType: InlineCodeScanningDefaultSetupRunnerTypeX672a5c06? = null,
  /**
   * The frequency of the periodic analysis.
   */
  public val schedule: InlineCodeScanningDefaultSetupScheduleXbe54427e? = null,
  /**
   * Code scanning default setup has been configured or not.
   */
  public val state: InlineCodeScanningDefaultSetupStateXb6f29bad? = null,
  /**
   * Threat model to be used for code scanning analysis. Use `remote` to analyze only network sources and
   * `remote_and_local` to include local sources like filesystem access, command-line arguments, database reads,
   * environment variable and standard input.
   */
  public val threatModel: InlineCodeScanningDefaultSetupThreatModelX2e887bf0? = null,
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
  public val languages: List<InlineCodeScanningDefaultSetupLanguagesItemX217a66c2>? =
      languages?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var languagesValue: List<InlineCodeScanningDefaultSetupLanguagesItemX217a66c2>? = null

    /**
     * Languages to be analyzed.
     */
    public var languages: List<InlineCodeScanningDefaultSetupLanguagesItemX217a66c2>?
      get() = languagesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        languagesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * CodeQL query suite to be used.
     */
    public var querySuite: InlineCodeScanningDefaultSetupQuerySuiteX99e920ab? = null

    /**
     * Runner label to be used if the runner type is labeled.
     */
    public var runnerLabel: String? = null

    /**
     * Runner type to be used.
     */
    public var runnerType: InlineCodeScanningDefaultSetupRunnerTypeX672a5c06? = null

    /**
     * The frequency of the periodic analysis.
     */
    public var schedule: InlineCodeScanningDefaultSetupScheduleXbe54427e? = null

    /**
     * Code scanning default setup has been configured or not.
     */
    public var state: InlineCodeScanningDefaultSetupStateXb6f29bad? = null

    /**
     * Threat model to be used for code scanning analysis. Use `remote` to analyze only network sources and
     * `remote_and_local` to include local sources like filesystem access, command-line arguments, database reads,
     * environment variable and standard input.
     */
    public var threatModel: InlineCodeScanningDefaultSetupThreatModelX2e887bf0? = null

    /**
     * Timestamp of latest configuration update.
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var updatedAt: String? = null

    public fun build(): CodeScanningDefaultSetup = CodeScanningDefaultSetup(
      languages = languages,
      querySuite = querySuite,
      runnerLabel = runnerLabel,
      runnerType = runnerType,
      schedule = schedule,
      state = state,
      threatModel = threatModel,
      updatedAt = updatedAt,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodeScanningDefaultSetup = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CodeScanningDefaultSetup> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodeScanningDefaultSetup {
      val jsonDecoder = decoder.requireJsonDecoder("CodeScanningDefaultSetup")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodeScanningDefaultSetup must be a JSON object")
      return CodeScanningDefaultSetup(
        languages = rawObject["languages"]?.let { json.decodeFromJsonElement<List<InlineCodeScanningDefaultSetupLanguagesItemX217a66c2>>(it) },
        querySuite = rawObject["query_suite"]?.let { json.decodeFromJsonElement<InlineCodeScanningDefaultSetupQuerySuiteX99e920ab>(it) },
        runnerLabel = rawObject["runner_label"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        runnerType = rawObject["runner_type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCodeScanningDefaultSetupRunnerTypeX672a5c06?>(element) },
        schedule = rawObject["schedule"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCodeScanningDefaultSetupScheduleXbe54427e?>(element) },
        state = rawObject["state"]?.let { json.decodeFromJsonElement<InlineCodeScanningDefaultSetupStateXb6f29bad>(it) },
        threatModel = rawObject["threat_model"]?.let { json.decodeFromJsonElement<InlineCodeScanningDefaultSetupThreatModelX2e887bf0>(it) },
        updatedAt = rawObject["updated_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodeScanningDefaultSetup) {
      val jsonEncoder = encoder.requireJsonEncoder("CodeScanningDefaultSetup")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.languages?.let { put("languages", json.encodeToJsonElement(it)) }
        value.querySuite?.let { put("query_suite", json.encodeToJsonElement(it)) }
        value.runnerLabel?.let { put("runner_label", it) }
        value.runnerType?.let { put("runner_type", json.encodeToJsonElement(it)) }
        value.schedule?.let { put("schedule", json.encodeToJsonElement(it)) }
        value.state?.let { put("state", json.encodeToJsonElement(it)) }
        value.threatModel?.let { put("threat_model", json.encodeToJsonElement(it)) }
        value.updatedAt?.let { put("updated_at", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codeScanningDefaultSetup(block: CodeScanningDefaultSetup.Builder.() -> Unit): CodeScanningDefaultSetup = CodeScanningDefaultSetup.build(block)
