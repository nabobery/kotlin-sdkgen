package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The destination type. Only stable destination types are accepted.
 */
@Serializable(with = InlineComponentsSchemasCreateObservabilityDestinationRequestPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasCreateObservabilityDestinationRequestPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `arize`.
   */
  public data object Arize : InlineComponentsSchemasCreateObservabilityDestinationRequestPropertiesType() {
    public override val `value`: String = "arize"
  }

  /**
   * Documented value. Wire value: `braintrust`.
   */
  public data object Braintrust : InlineComponentsSchemasCreateObservabilityDestinationRequestPropertiesType() {
    public override val `value`: String = "braintrust"
  }

  /**
   * Documented value. Wire value: `clickhouse`.
   */
  public data object Clickhouse : InlineComponentsSchemasCreateObservabilityDestinationRequestPropertiesType() {
    public override val `value`: String = "clickhouse"
  }

  /**
   * Documented value. Wire value: `datadog`.
   */
  public data object Datadog : InlineComponentsSchemasCreateObservabilityDestinationRequestPropertiesType() {
    public override val `value`: String = "datadog"
  }

  /**
   * Documented value. Wire value: `grafana`.
   */
  public data object Grafana : InlineComponentsSchemasCreateObservabilityDestinationRequestPropertiesType() {
    public override val `value`: String = "grafana"
  }

  /**
   * Documented value. Wire value: `langfuse`.
   */
  public data object Langfuse : InlineComponentsSchemasCreateObservabilityDestinationRequestPropertiesType() {
    public override val `value`: String = "langfuse"
  }

  /**
   * Documented value. Wire value: `langsmith`.
   */
  public data object Langsmith : InlineComponentsSchemasCreateObservabilityDestinationRequestPropertiesType() {
    public override val `value`: String = "langsmith"
  }

  /**
   * Documented value. Wire value: `newrelic`.
   */
  public data object Newrelic : InlineComponentsSchemasCreateObservabilityDestinationRequestPropertiesType() {
    public override val `value`: String = "newrelic"
  }

  /**
   * Documented value. Wire value: `opik`.
   */
  public data object Opik : InlineComponentsSchemasCreateObservabilityDestinationRequestPropertiesType() {
    public override val `value`: String = "opik"
  }

  /**
   * Documented value. Wire value: `otel-collector`.
   */
  public data object OtelCollector : InlineComponentsSchemasCreateObservabilityDestinationRequestPropertiesType() {
    public override val `value`: String = "otel-collector"
  }

  /**
   * Documented value. Wire value: `posthog`.
   */
  public data object Posthog : InlineComponentsSchemasCreateObservabilityDestinationRequestPropertiesType() {
    public override val `value`: String = "posthog"
  }

  /**
   * Documented value. Wire value: `ramp`.
   */
  public data object Ramp : InlineComponentsSchemasCreateObservabilityDestinationRequestPropertiesType() {
    public override val `value`: String = "ramp"
  }

  /**
   * Documented value. Wire value: `s3`.
   */
  public data object S3 : InlineComponentsSchemasCreateObservabilityDestinationRequestPropertiesType() {
    public override val `value`: String = "s3"
  }

  /**
   * Documented value. Wire value: `sentry`.
   */
  public data object Sentry : InlineComponentsSchemasCreateObservabilityDestinationRequestPropertiesType() {
    public override val `value`: String = "sentry"
  }

  /**
   * Documented value. Wire value: `snowflake`.
   */
  public data object Snowflake : InlineComponentsSchemasCreateObservabilityDestinationRequestPropertiesType() {
    public override val `value`: String = "snowflake"
  }

  /**
   * Documented value. Wire value: `weave`.
   */
  public data object Weave : InlineComponentsSchemasCreateObservabilityDestinationRequestPropertiesType() {
    public override val `value`: String = "weave"
  }

  /**
   * Documented value. Wire value: `webhook`.
   */
  public data object Webhook : InlineComponentsSchemasCreateObservabilityDestinationRequestPropertiesType() {
    public override val `value`: String = "webhook"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasCreateObservabilityDestinationRequestPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasCreateObservabilityDestinationRequestPropertiesType =
      when (value) {
      Arize.value -> Arize
      Braintrust.value -> Braintrust
      Clickhouse.value -> Clickhouse
      Datadog.value -> Datadog
      Grafana.value -> Grafana
      Langfuse.value -> Langfuse
      Langsmith.value -> Langsmith
      Newrelic.value -> Newrelic
      Opik.value -> Opik
      OtelCollector.value -> OtelCollector
      Posthog.value -> Posthog
      Ramp.value -> Ramp
      S3.value -> S3
      Sentry.value -> Sentry
      Snowflake.value -> Snowflake
      Weave.value -> Weave
      Webhook.value -> Webhook
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasCreateObservabilityDestinationRequestPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasCreateObservabilityDestinationRequestPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasCreateObservabilityDestinationRequestPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasCreateObservabilityDestinationRequestPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
