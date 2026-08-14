package io.github.nabobery.sdkgen.generated.stripe.invoices

import com.nabobery.sdkgen.runtime.BackoffHints
import com.nabobery.sdkgen.runtime.CallOptions
import com.nabobery.sdkgen.runtime.KotlinxSerializationCodec
import com.nabobery.sdkgen.runtime.MediaTypeCodec
import com.nabobery.sdkgen.runtime.MediaTypeCodecRegistry
import com.nabobery.sdkgen.runtime.OperationMetadata
import com.nabobery.sdkgen.runtime.OperationSafety
import com.nabobery.sdkgen.runtime.ResponseAlternative
import com.nabobery.sdkgen.runtime.ResponseSelector
import com.nabobery.sdkgen.runtime.RetryDescriptor
import com.nabobery.sdkgen.runtime.SdkAuthentication
import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkExecutionRequest
import com.nabobery.sdkgen.runtime.SdkExecutor
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkParameterLocation
import com.nabobery.sdkgen.runtime.SdkRequestBody
import com.nabobery.sdkgen.runtime.SdkRequestParameter
import com.nabobery.sdkgen.runtime.SdkResponseAlternativeDecoder
import com.nabobery.sdkgen.runtime.SdkResponseDecodeResult
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.SdkResponseResult
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.SecurityRequirement
import com.nabobery.sdkgen.runtime.SecuritySchemeRef
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.SecurityScheme
import com.nabobery.sdkgen.runtime.auth.SecuritySchemeAuthentication
import com.nabobery.sdkgen.runtime.auth.SecuritySchemeBinding
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import com.nabobery.sdkgen.runtime.bodies.FormUrlEncodedBody
import io.github.nabobery.sdkgen.generated.stripe.DeletedInvoice
import io.github.nabobery.sdkgen.generated.stripe.Error
import io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicesAddLinesPostRequestFormX5fcd6d4a
import io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicesAttachPaymentPostRequestFormX4b78a621
import io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicesFinalizePostRequestFormXef2b05e1
import io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicesGetParameterX5346dfcd
import io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicesGetParameterX615bb39b
import io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicesGetParameterX751afae8
import io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicesGetParameterXb8e276b5
import io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicesGetResponse200JsonXa7c172e4
import io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicesLinesGetResponse200JsonXf5c237ad
import io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicesLinesPostRequestFormXeff471a0
import io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicesMarkUncollectiblePostRequestFormX5f3ee136
import io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicesRemoveLinesPostRequestFormXfc30f642
import io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicesSearchGetResponse200JsonX2e73b6f3
import io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicesSendPostRequestFormX5abfd413
import io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicesUpdateLinesPostRequestFormXf374c0fb
import io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicesVoidPostRequestFormX16ba2a51
import io.github.nabobery.sdkgen.generated.stripe.Invoice
import io.github.nabobery.sdkgen.generated.stripe.LineItem
import io.github.nabobery.sdkgen.generated.stripe.SdkJson
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

internal object InvoicesCodecs {
  internal const val DELETEINVOICESINVOICE_REQUEST_CODEC_ID: String =
      "DeleteInvoicesInvoice.request"

  private val deleteInvoicesInvoiceRequestCodec: MediaTypeCodec<JsonObject?> =
      DeleteInvoicesInvoiceFormCodec

  private val deleteInvoicesInvoiceResponseCodecAlternative0Codec: MediaTypeCodec<DeletedInvoice> =
      KotlinxSerializationCodec("DeleteInvoicesInvoice.response.alternative0", DeletedInvoice.Serializer, SdkJson)

  internal val deleteInvoicesInvoiceResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DeletedInvoice> =
      MediaTypeCodecRegistry.of(deleteInvoicesInvoiceResponseCodecAlternative0Codec)

  private val deleteInvoicesInvoiceResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("DeleteInvoicesInvoice.response.alternative1", Error.Serializer, SdkJson)

  internal val deleteInvoicesInvoiceResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error>
      = MediaTypeCodecRegistry.of(deleteInvoicesInvoiceResponseCodecAlternative1Codec)

  internal val deleteInvoicesInvoiceRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(deleteInvoicesInvoiceRequestCodec)

  internal const val GETINVOICES_REQUEST_CODEC_ID: String = "GetInvoices.request"

  private val getInvoicesRequestCodec: MediaTypeCodec<JsonObject?> = GetInvoicesFormCodec

  private val getInvoicesResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1InvoicesGetResponse200JsonXa7c172e4> =
      KotlinxSerializationCodec("GetInvoices.response.alternative0", InlineV1InvoicesGetResponse200JsonXa7c172e4.Serializer, SdkJson)

  internal val getInvoicesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1InvoicesGetResponse200JsonXa7c172e4> =
      MediaTypeCodecRegistry.of(getInvoicesResponseCodecAlternative0Codec)

  private val getInvoicesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetInvoices.response.alternative1", Error.Serializer, SdkJson)

  internal val getInvoicesResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getInvoicesResponseCodecAlternative1Codec)

  internal val getInvoicesRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getInvoicesRequestCodec)

  internal const val GETINVOICESINVOICE_REQUEST_CODEC_ID: String = "GetInvoicesInvoice.request"

  private val getInvoicesInvoiceRequestCodec: MediaTypeCodec<JsonObject?> =
      GetInvoicesInvoiceFormCodec

  private val getInvoicesInvoiceResponseCodecAlternative0Codec: MediaTypeCodec<Invoice> =
      KotlinxSerializationCodec("GetInvoicesInvoice.response.alternative0", Invoice.Serializer, SdkJson)

  internal val getInvoicesInvoiceResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Invoice>
      = MediaTypeCodecRegistry.of(getInvoicesInvoiceResponseCodecAlternative0Codec)

  private val getInvoicesInvoiceResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetInvoicesInvoice.response.alternative1", Error.Serializer, SdkJson)

  internal val getInvoicesInvoiceResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getInvoicesInvoiceResponseCodecAlternative1Codec)

  internal val getInvoicesInvoiceRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getInvoicesInvoiceRequestCodec)

  internal const val GETINVOICESINVOICELINES_REQUEST_CODEC_ID: String =
      "GetInvoicesInvoiceLines.request"

  private val getInvoicesInvoiceLinesRequestCodec: MediaTypeCodec<JsonObject?> =
      GetInvoicesInvoiceLinesFormCodec

  private val getInvoicesInvoiceLinesResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1InvoicesLinesGetResponse200JsonXf5c237ad> =
      KotlinxSerializationCodec("GetInvoicesInvoiceLines.response.alternative0", InlineV1InvoicesLinesGetResponse200JsonXf5c237ad.Serializer, SdkJson)

  internal val getInvoicesInvoiceLinesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1InvoicesLinesGetResponse200JsonXf5c237ad> =
      MediaTypeCodecRegistry.of(getInvoicesInvoiceLinesResponseCodecAlternative0Codec)

  private val getInvoicesInvoiceLinesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetInvoicesInvoiceLines.response.alternative1", Error.Serializer, SdkJson)

  internal val getInvoicesInvoiceLinesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getInvoicesInvoiceLinesResponseCodecAlternative1Codec)

  internal val getInvoicesInvoiceLinesRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getInvoicesInvoiceLinesRequestCodec)

  internal const val GETINVOICESSEARCH_REQUEST_CODEC_ID: String = "GetInvoicesSearch.request"

  private val getInvoicesSearchRequestCodec: MediaTypeCodec<JsonObject?> =
      GetInvoicesSearchFormCodec

  private val getInvoicesSearchResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1InvoicesSearchGetResponse200JsonX2e73b6f3> =
      KotlinxSerializationCodec("GetInvoicesSearch.response.alternative0", InlineV1InvoicesSearchGetResponse200JsonX2e73b6f3.Serializer, SdkJson)

  internal val getInvoicesSearchResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1InvoicesSearchGetResponse200JsonX2e73b6f3> =
      MediaTypeCodecRegistry.of(getInvoicesSearchResponseCodecAlternative0Codec)

  private val getInvoicesSearchResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetInvoicesSearch.response.alternative1", Error.Serializer, SdkJson)

  internal val getInvoicesSearchResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getInvoicesSearchResponseCodecAlternative1Codec)

  internal val getInvoicesSearchRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getInvoicesSearchRequestCodec)

  internal const val POSTINVOICESINVOICEADDLINES_REQUEST_CODEC_ID: String =
      "PostInvoicesInvoiceAddLines.request"

  private val postInvoicesInvoiceAddLinesRequestCodec:
      MediaTypeCodec<InlineV1InvoicesAddLinesPostRequestFormX5fcd6d4a> =
      PostInvoicesInvoiceAddLinesFormCodec

  private val postInvoicesInvoiceAddLinesResponseCodecAlternative0Codec: MediaTypeCodec<Invoice> =
      KotlinxSerializationCodec("PostInvoicesInvoiceAddLines.response.alternative0", Invoice.Serializer, SdkJson)

  internal val postInvoicesInvoiceAddLinesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Invoice> =
      MediaTypeCodecRegistry.of(postInvoicesInvoiceAddLinesResponseCodecAlternative0Codec)

  private val postInvoicesInvoiceAddLinesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostInvoicesInvoiceAddLines.response.alternative1", Error.Serializer, SdkJson)

  internal val postInvoicesInvoiceAddLinesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postInvoicesInvoiceAddLinesResponseCodecAlternative1Codec)

  internal val postInvoicesInvoiceAddLinesRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1InvoicesAddLinesPostRequestFormX5fcd6d4a> =
      MediaTypeCodecRegistry.of(postInvoicesInvoiceAddLinesRequestCodec)

  internal const val POSTINVOICESINVOICEATTACHPAYMENT_REQUEST_CODEC_ID: String =
      "PostInvoicesInvoiceAttachPayment.request"

  private val postInvoicesInvoiceAttachPaymentRequestCodec:
      MediaTypeCodec<InlineV1InvoicesAttachPaymentPostRequestFormX4b78a621?> =
      PostInvoicesInvoiceAttachPaymentFormCodec

  private val postInvoicesInvoiceAttachPaymentResponseCodecAlternative0Codec:
      MediaTypeCodec<Invoice> =
      KotlinxSerializationCodec("PostInvoicesInvoiceAttachPayment.response.alternative0", Invoice.Serializer, SdkJson)

  internal val postInvoicesInvoiceAttachPaymentResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Invoice> =
      MediaTypeCodecRegistry.of(postInvoicesInvoiceAttachPaymentResponseCodecAlternative0Codec)

  private val postInvoicesInvoiceAttachPaymentResponseCodecAlternative1Codec: MediaTypeCodec<Error>
      =
      KotlinxSerializationCodec("PostInvoicesInvoiceAttachPayment.response.alternative1", Error.Serializer, SdkJson)

  internal val postInvoicesInvoiceAttachPaymentResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postInvoicesInvoiceAttachPaymentResponseCodecAlternative1Codec)

  internal val postInvoicesInvoiceAttachPaymentRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1InvoicesAttachPaymentPostRequestFormX4b78a621?> =
      MediaTypeCodecRegistry.of(postInvoicesInvoiceAttachPaymentRequestCodec)

  internal const val POSTINVOICESINVOICEFINALIZE_REQUEST_CODEC_ID: String =
      "PostInvoicesInvoiceFinalize.request"

  private val postInvoicesInvoiceFinalizeRequestCodec:
      MediaTypeCodec<InlineV1InvoicesFinalizePostRequestFormXef2b05e1?> =
      PostInvoicesInvoiceFinalizeFormCodec

  private val postInvoicesInvoiceFinalizeResponseCodecAlternative0Codec: MediaTypeCodec<Invoice> =
      KotlinxSerializationCodec("PostInvoicesInvoiceFinalize.response.alternative0", Invoice.Serializer, SdkJson)

  internal val postInvoicesInvoiceFinalizeResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Invoice> =
      MediaTypeCodecRegistry.of(postInvoicesInvoiceFinalizeResponseCodecAlternative0Codec)

  private val postInvoicesInvoiceFinalizeResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostInvoicesInvoiceFinalize.response.alternative1", Error.Serializer, SdkJson)

  internal val postInvoicesInvoiceFinalizeResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postInvoicesInvoiceFinalizeResponseCodecAlternative1Codec)

  internal val postInvoicesInvoiceFinalizeRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1InvoicesFinalizePostRequestFormXef2b05e1?> =
      MediaTypeCodecRegistry.of(postInvoicesInvoiceFinalizeRequestCodec)

  internal const val POSTINVOICESINVOICELINESLINEITEMID_REQUEST_CODEC_ID: String =
      "PostInvoicesInvoiceLinesLineItemId.request"

  private val postInvoicesInvoiceLinesLineItemIdRequestCodec:
      MediaTypeCodec<InlineV1InvoicesLinesPostRequestFormXeff471a0?> =
      PostInvoicesInvoiceLinesLineItemIdFormCodec

  private val postInvoicesInvoiceLinesLineItemIdResponseCodecAlternative0Codec:
      MediaTypeCodec<LineItem> =
      KotlinxSerializationCodec("PostInvoicesInvoiceLinesLineItemId.response.alternative0", LineItem.Serializer, SdkJson)

  internal val postInvoicesInvoiceLinesLineItemIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<LineItem> =
      MediaTypeCodecRegistry.of(postInvoicesInvoiceLinesLineItemIdResponseCodecAlternative0Codec)

  private val postInvoicesInvoiceLinesLineItemIdResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostInvoicesInvoiceLinesLineItemId.response.alternative1", Error.Serializer, SdkJson)

  internal val postInvoicesInvoiceLinesLineItemIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postInvoicesInvoiceLinesLineItemIdResponseCodecAlternative1Codec)

  internal val postInvoicesInvoiceLinesLineItemIdRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1InvoicesLinesPostRequestFormXeff471a0?> =
      MediaTypeCodecRegistry.of(postInvoicesInvoiceLinesLineItemIdRequestCodec)

  internal const val POSTINVOICESINVOICEMARKUNCOLLECTIBLE_REQUEST_CODEC_ID: String =
      "PostInvoicesInvoiceMarkUncollectible.request"

  private val postInvoicesInvoiceMarkUncollectibleRequestCodec:
      MediaTypeCodec<InlineV1InvoicesMarkUncollectiblePostRequestFormX5f3ee136?> =
      PostInvoicesInvoiceMarkUncollectibleFormCodec

  private val postInvoicesInvoiceMarkUncollectibleResponseCodecAlternative0Codec:
      MediaTypeCodec<Invoice> =
      KotlinxSerializationCodec("PostInvoicesInvoiceMarkUncollectible.response.alternative0", Invoice.Serializer, SdkJson)

  internal val postInvoicesInvoiceMarkUncollectibleResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Invoice> =
      MediaTypeCodecRegistry.of(postInvoicesInvoiceMarkUncollectibleResponseCodecAlternative0Codec)

  private val postInvoicesInvoiceMarkUncollectibleResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostInvoicesInvoiceMarkUncollectible.response.alternative1", Error.Serializer, SdkJson)

  internal val postInvoicesInvoiceMarkUncollectibleResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postInvoicesInvoiceMarkUncollectibleResponseCodecAlternative1Codec)

  internal val postInvoicesInvoiceMarkUncollectibleRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1InvoicesMarkUncollectiblePostRequestFormX5f3ee136?> =
      MediaTypeCodecRegistry.of(postInvoicesInvoiceMarkUncollectibleRequestCodec)

  internal const val POSTINVOICESINVOICEREMOVELINES_REQUEST_CODEC_ID: String =
      "PostInvoicesInvoiceRemoveLines.request"

  private val postInvoicesInvoiceRemoveLinesRequestCodec:
      MediaTypeCodec<InlineV1InvoicesRemoveLinesPostRequestFormXfc30f642> =
      PostInvoicesInvoiceRemoveLinesFormCodec

  private val postInvoicesInvoiceRemoveLinesResponseCodecAlternative0Codec: MediaTypeCodec<Invoice>
      =
      KotlinxSerializationCodec("PostInvoicesInvoiceRemoveLines.response.alternative0", Invoice.Serializer, SdkJson)

  internal val postInvoicesInvoiceRemoveLinesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Invoice> =
      MediaTypeCodecRegistry.of(postInvoicesInvoiceRemoveLinesResponseCodecAlternative0Codec)

  private val postInvoicesInvoiceRemoveLinesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostInvoicesInvoiceRemoveLines.response.alternative1", Error.Serializer, SdkJson)

  internal val postInvoicesInvoiceRemoveLinesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postInvoicesInvoiceRemoveLinesResponseCodecAlternative1Codec)

  internal val postInvoicesInvoiceRemoveLinesRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1InvoicesRemoveLinesPostRequestFormXfc30f642> =
      MediaTypeCodecRegistry.of(postInvoicesInvoiceRemoveLinesRequestCodec)

  internal const val POSTINVOICESINVOICESEND_REQUEST_CODEC_ID: String =
      "PostInvoicesInvoiceSend.request"

  private val postInvoicesInvoiceSendRequestCodec:
      MediaTypeCodec<InlineV1InvoicesSendPostRequestFormX5abfd413?> =
      PostInvoicesInvoiceSendFormCodec

  private val postInvoicesInvoiceSendResponseCodecAlternative0Codec: MediaTypeCodec<Invoice> =
      KotlinxSerializationCodec("PostInvoicesInvoiceSend.response.alternative0", Invoice.Serializer, SdkJson)

  internal val postInvoicesInvoiceSendResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Invoice> =
      MediaTypeCodecRegistry.of(postInvoicesInvoiceSendResponseCodecAlternative0Codec)

  private val postInvoicesInvoiceSendResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostInvoicesInvoiceSend.response.alternative1", Error.Serializer, SdkJson)

  internal val postInvoicesInvoiceSendResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postInvoicesInvoiceSendResponseCodecAlternative1Codec)

  internal val postInvoicesInvoiceSendRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1InvoicesSendPostRequestFormX5abfd413?> =
      MediaTypeCodecRegistry.of(postInvoicesInvoiceSendRequestCodec)

  internal const val POSTINVOICESINVOICEUPDATELINES_REQUEST_CODEC_ID: String =
      "PostInvoicesInvoiceUpdateLines.request"

  private val postInvoicesInvoiceUpdateLinesRequestCodec:
      MediaTypeCodec<InlineV1InvoicesUpdateLinesPostRequestFormXf374c0fb> =
      PostInvoicesInvoiceUpdateLinesFormCodec

  private val postInvoicesInvoiceUpdateLinesResponseCodecAlternative0Codec: MediaTypeCodec<Invoice>
      =
      KotlinxSerializationCodec("PostInvoicesInvoiceUpdateLines.response.alternative0", Invoice.Serializer, SdkJson)

  internal val postInvoicesInvoiceUpdateLinesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Invoice> =
      MediaTypeCodecRegistry.of(postInvoicesInvoiceUpdateLinesResponseCodecAlternative0Codec)

  private val postInvoicesInvoiceUpdateLinesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostInvoicesInvoiceUpdateLines.response.alternative1", Error.Serializer, SdkJson)

  internal val postInvoicesInvoiceUpdateLinesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postInvoicesInvoiceUpdateLinesResponseCodecAlternative1Codec)

  internal val postInvoicesInvoiceUpdateLinesRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1InvoicesUpdateLinesPostRequestFormXf374c0fb> =
      MediaTypeCodecRegistry.of(postInvoicesInvoiceUpdateLinesRequestCodec)

  internal const val POSTINVOICESINVOICEVOID_REQUEST_CODEC_ID: String =
      "PostInvoicesInvoiceVoid.request"

  private val postInvoicesInvoiceVoidRequestCodec:
      MediaTypeCodec<InlineV1InvoicesVoidPostRequestFormX16ba2a51?> =
      PostInvoicesInvoiceVoidFormCodec

  private val postInvoicesInvoiceVoidResponseCodecAlternative0Codec: MediaTypeCodec<Invoice> =
      KotlinxSerializationCodec("PostInvoicesInvoiceVoid.response.alternative0", Invoice.Serializer, SdkJson)

  internal val postInvoicesInvoiceVoidResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Invoice> =
      MediaTypeCodecRegistry.of(postInvoicesInvoiceVoidResponseCodecAlternative0Codec)

  private val postInvoicesInvoiceVoidResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostInvoicesInvoiceVoid.response.alternative1", Error.Serializer, SdkJson)

  internal val postInvoicesInvoiceVoidResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postInvoicesInvoiceVoidResponseCodecAlternative1Codec)

  internal val postInvoicesInvoiceVoidRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1InvoicesVoidPostRequestFormX16ba2a51?> =
      MediaTypeCodecRegistry.of(postInvoicesInvoiceVoidRequestCodec)

  internal object DeleteInvoicesInvoiceFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "DeleteInvoicesInvoice.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: JsonObject?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): JsonObject? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object GetInvoicesFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetInvoices.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: JsonObject?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): JsonObject? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object GetInvoicesInvoiceFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetInvoicesInvoice.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: JsonObject?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): JsonObject? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object GetInvoicesInvoiceLinesFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetInvoicesInvoiceLines.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: JsonObject?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): JsonObject? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object GetInvoicesSearchFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetInvoicesSearch.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: JsonObject?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): JsonObject? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostInvoicesInvoiceAddLinesFormCodec : MediaTypeCodec<InlineV1InvoicesAddLinesPostRequestFormX5fcd6d4a> {
    override val id: String = "PostInvoicesInvoiceAddLines.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1InvoicesAddLinesPostRequestFormX5fcd6d4a, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      request.invoiceMetadata?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            requireNotNull(formValue0.branch1).forEach { (formKey2, formMapValue2) ->
              val formPrimitive2 = formMapValue2 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
              form.add("invoice_metadata" + "[" + formKey2 + "]", formPrimitive2.content)
            }
          }
          formValue0.inlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataAnyOf2X3290de5b != null -> {
            form.add("invoice_metadata", requireNotNull(formValue0.inlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataAnyOf2X3290de5b).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      if (request.lines.isEmpty()) {
        form.add("lines", "")
      } else {
        request.lines.forEachIndexed { formIndex0, formElement0 ->
          formElement0.amount?.let { formValue2 ->
            form.add("lines" + "[" + formIndex0 + "]" + "[amount]", formValue2.toString())
          }
          formElement0.description?.let { formValue2 ->
            form.add("lines" + "[" + formIndex0 + "]" + "[description]", formValue2)
          }
          formElement0.discountable?.let { formValue2 ->
            form.add("lines" + "[" + formIndex0 + "]" + "[discountable]", formValue2.toString())
          }
          formElement0.discounts?.let { formValue2 ->
            require(formValue2.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
            when {
              formValue2.branch1 != null -> {
                if (requireNotNull(formValue2.branch1).isEmpty()) {
                  form.add("lines" + "[" + formIndex0 + "]" + "[discounts]", "")
                } else {
                  requireNotNull(formValue2.branch1).forEachIndexed { formIndex4, formElement4 ->
                    formElement4.coupon?.let { formValue6 ->
                      form.add("lines" + "[" + formIndex0 + "]" + "[discounts]" + "[" + formIndex4 + "]" + "[coupon]", formValue6)
                    }
                    formElement4.discount?.let { formValue6 ->
                      form.add("lines" + "[" + formIndex0 + "]" + "[discounts]" + "[" + formIndex4 + "]" + "[discount]", formValue6)
                    }
                    formElement4.promotionCode?.let { formValue6 ->
                      form.add("lines" + "[" + formIndex0 + "]" + "[discounts]" + "[" + formIndex4 + "]" + "[promotion_code]", formValue6)
                    }
                  }
                }
              }
              formValue2.inlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsAnyOf2X5d080961 != null -> {
                form.add("lines" + "[" + formIndex0 + "]" + "[discounts]", requireNotNull(formValue2.inlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsAnyOf2X5d080961).value)
              }
              else -> {
                error("Form union value has no selected branch")
              }
            }
          }
          formElement0.invoiceItem?.let { formValue2 ->
            form.add("lines" + "[" + formIndex0 + "]" + "[invoice_item]", formValue2)
          }
          formElement0.metadata?.let { formValue2 ->
            require(formValue2.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
            when {
              formValue2.branch1 != null -> {
                requireNotNull(formValue2.branch1).forEach { (formKey4, formMapValue4) ->
                  val formPrimitive4 = formMapValue4 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
                  form.add("lines" + "[" + formIndex0 + "]" + "[metadata]" + "[" + formKey4 + "]", formPrimitive4.content)
                }
              }
              formValue2.inlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataAnyOf2X6e0c32a6 != null -> {
                form.add("lines" + "[" + formIndex0 + "]" + "[metadata]", requireNotNull(formValue2.inlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataAnyOf2X6e0c32a6).value)
              }
              else -> {
                error("Form union value has no selected branch")
              }
            }
          }
          formElement0.period?.let { formValue2 ->
            form.add("lines" + "[" + formIndex0 + "]" + "[period]" + "[end]", formValue2.end.toString())
            form.add("lines" + "[" + formIndex0 + "]" + "[period]" + "[start]", formValue2.start.toString())
          }
          formElement0.priceData?.let { formValue2 ->
            form.add("lines" + "[" + formIndex0 + "]" + "[price_data]" + "[currency]", formValue2.currency)
            formValue2.product?.let { formValue4 ->
              form.add("lines" + "[" + formIndex0 + "]" + "[price_data]" + "[product]", formValue4)
            }
            formValue2.productData?.let { formValue4 ->
              formValue4.description?.let { formValue6 ->
                form.add("lines" + "[" + formIndex0 + "]" + "[price_data]" + "[product_data]" + "[description]", formValue6)
              }
              formValue4.images?.let { formValue6 ->
                if (formValue6.isEmpty()) {
                  form.add("lines" + "[" + formIndex0 + "]" + "[price_data]" + "[product_data]" + "[images]", "")
                } else {
                  formValue6.forEachIndexed { formIndex7, formElement7 ->
                    form.add("lines" + "[" + formIndex0 + "]" + "[price_data]" + "[product_data]" + "[images]" + "[" + formIndex7 + "]", formElement7)
                  }
                }
              }
              formValue4.metadata?.let { formValue6 ->
                formValue6.forEach { (formKey7, formMapValue7) ->
                  form.add("lines" + "[" + formIndex0 + "]" + "[price_data]" + "[product_data]" + "[metadata]" + "[" + formKey7 + "]", formMapValue7)
                }
              }
              form.add("lines" + "[" + formIndex0 + "]" + "[price_data]" + "[product_data]" + "[name]", formValue4.name)
              formValue4.taxCode?.let { formValue6 ->
                form.add("lines" + "[" + formIndex0 + "]" + "[price_data]" + "[product_data]" + "[tax_code]", formValue6)
              }
              formValue4.unitLabel?.let { formValue6 ->
                form.add("lines" + "[" + formIndex0 + "]" + "[price_data]" + "[product_data]" + "[unit_label]", formValue6)
              }
            }
            formValue2.taxBehavior?.let { formValue4 ->
              form.add("lines" + "[" + formIndex0 + "]" + "[price_data]" + "[tax_behavior]", formValue4.value)
            }
            formValue2.unitAmount?.let { formValue4 ->
              form.add("lines" + "[" + formIndex0 + "]" + "[price_data]" + "[unit_amount]", formValue4.toString())
            }
            formValue2.unitAmountDecimal?.let { formValue4 ->
              form.add("lines" + "[" + formIndex0 + "]" + "[price_data]" + "[unit_amount_decimal]", formValue4)
            }
          }
          formElement0.pricing?.let { formValue2 ->
            formValue2.price?.let { formValue4 ->
              form.add("lines" + "[" + formIndex0 + "]" + "[pricing]" + "[price]", formValue4)
            }
          }
          formElement0.quantity?.let { formValue2 ->
            form.add("lines" + "[" + formIndex0 + "]" + "[quantity]", formValue2.toString())
          }
          formElement0.quantityDecimal?.let { formValue2 ->
            form.add("lines" + "[" + formIndex0 + "]" + "[quantity_decimal]", formValue2)
          }
          formElement0.taxAmounts?.let { formValue2 ->
            require(formValue2.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
            when {
              formValue2.branch1 != null -> {
                if (requireNotNull(formValue2.branch1).isEmpty()) {
                  form.add("lines" + "[" + formIndex0 + "]" + "[tax_amounts]", "")
                } else {
                  requireNotNull(formValue2.branch1).forEachIndexed { formIndex4, formElement4 ->
                    form.add("lines" + "[" + formIndex0 + "]" + "[tax_amounts]" + "[" + formIndex4 + "]" + "[amount]", formElement4.amount.toString())
                    formElement4.taxRateData.country?.let { formValue7 ->
                      form.add("lines" + "[" + formIndex0 + "]" + "[tax_amounts]" + "[" + formIndex4 + "]" + "[tax_rate_data]" + "[country]", formValue7)
                    }
                    formElement4.taxRateData.description?.let { formValue7 ->
                      form.add("lines" + "[" + formIndex0 + "]" + "[tax_amounts]" + "[" + formIndex4 + "]" + "[tax_rate_data]" + "[description]", formValue7)
                    }
                    form.add("lines" + "[" + formIndex0 + "]" + "[tax_amounts]" + "[" + formIndex4 + "]" + "[tax_rate_data]" + "[display_name]", formElement4.taxRateData.displayName)
                    form.add("lines" + "[" + formIndex0 + "]" + "[tax_amounts]" + "[" + formIndex4 + "]" + "[tax_rate_data]" + "[inclusive]", formElement4.taxRateData.inclusive.toString())
                    formElement4.taxRateData.jurisdiction?.let { formValue7 ->
                      form.add("lines" + "[" + formIndex0 + "]" + "[tax_amounts]" + "[" + formIndex4 + "]" + "[tax_rate_data]" + "[jurisdiction]", formValue7)
                    }
                    formElement4.taxRateData.jurisdictionLevel?.let { formValue7 ->
                      form.add("lines" + "[" + formIndex0 + "]" + "[tax_amounts]" + "[" + formIndex4 + "]" + "[tax_rate_data]" + "[jurisdiction_level]", formValue7.value)
                    }
                    form.add("lines" + "[" + formIndex0 + "]" + "[tax_amounts]" + "[" + formIndex4 + "]" + "[tax_rate_data]" + "[percentage]", formElement4.taxRateData.percentage)
                    formElement4.taxRateData.state?.let { formValue7 ->
                      form.add("lines" + "[" + formIndex0 + "]" + "[tax_amounts]" + "[" + formIndex4 + "]" + "[tax_rate_data]" + "[state]", formValue7)
                    }
                    formElement4.taxRateData.taxType?.let { formValue7 ->
                      form.add("lines" + "[" + formIndex0 + "]" + "[tax_amounts]" + "[" + formIndex4 + "]" + "[tax_rate_data]" + "[tax_type]", formValue7.value)
                    }
                    formElement4.taxabilityReason?.let { formValue6 ->
                      form.add("lines" + "[" + formIndex0 + "]" + "[tax_amounts]" + "[" + formIndex4 + "]" + "[taxability_reason]", formValue6.value)
                    }
                    form.add("lines" + "[" + formIndex0 + "]" + "[tax_amounts]" + "[" + formIndex4 + "]" + "[taxable_amount]", formElement4.taxableAmount.toString())
                  }
                }
              }
              formValue2.inlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf2X01b8d97b != null -> {
                form.add("lines" + "[" + formIndex0 + "]" + "[tax_amounts]", requireNotNull(formValue2.inlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf2X01b8d97b).value)
              }
              else -> {
                error("Form union value has no selected branch")
              }
            }
          }
          formElement0.taxRates?.let { formValue2 ->
            require(formValue2.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
            when {
              formValue2.branch1 != null -> {
                if (requireNotNull(formValue2.branch1).isEmpty()) {
                  form.add("lines" + "[" + formIndex0 + "]" + "[tax_rates]", "")
                } else {
                  requireNotNull(formValue2.branch1).forEachIndexed { formIndex4, formElement4 ->
                    form.add("lines" + "[" + formIndex0 + "]" + "[tax_rates]" + "[" + formIndex4 + "]", formElement4)
                  }
                }
              }
              formValue2.inlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesAnyOf2X9d285ae4 != null -> {
                form.add("lines" + "[" + formIndex0 + "]" + "[tax_rates]", requireNotNull(formValue2.inlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesAnyOf2X9d285ae4).value)
              }
              else -> {
                error("Form union value has no selected branch")
              }
            }
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1InvoicesAddLinesPostRequestFormX5fcd6d4a {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostInvoicesInvoiceAttachPaymentFormCodec : MediaTypeCodec<InlineV1InvoicesAttachPaymentPostRequestFormX4b78a621?> {
    override val id: String = "PostInvoicesInvoiceAttachPayment.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1InvoicesAttachPaymentPostRequestFormX4b78a621?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      request.paymentIntent?.let { formValue0 ->
        form.add("payment_intent", formValue0)
      }
      request.paymentRecord?.let { formValue0 ->
        form.add("payment_record", formValue0)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1InvoicesAttachPaymentPostRequestFormX4b78a621? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostInvoicesInvoiceFinalizeFormCodec : MediaTypeCodec<InlineV1InvoicesFinalizePostRequestFormXef2b05e1?> {
    override val id: String = "PostInvoicesInvoiceFinalize.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1InvoicesFinalizePostRequestFormXef2b05e1?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.autoAdvance?.let { formValue0 ->
        form.add("auto_advance", formValue0.toString())
      }
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1InvoicesFinalizePostRequestFormXef2b05e1? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostInvoicesInvoiceLinesLineItemIdFormCodec : MediaTypeCodec<InlineV1InvoicesLinesPostRequestFormXeff471a0?> {
    override val id: String = "PostInvoicesInvoiceLinesLineItemId.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1InvoicesLinesPostRequestFormXeff471a0?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.amount?.let { formValue0 ->
        form.add("amount", formValue0.toString())
      }
      request.description?.let { formValue0 ->
        form.add("description", formValue0)
      }
      request.discountable?.let { formValue0 ->
        form.add("discountable", formValue0.toString())
      }
      request.discounts?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            if (requireNotNull(formValue0.branch1).isEmpty()) {
              form.add("discounts", "")
            } else {
              requireNotNull(formValue0.branch1).forEachIndexed { formIndex2, formElement2 ->
                formElement2.coupon?.let { formValue4 ->
                  form.add("discounts" + "[" + formIndex2 + "]" + "[coupon]", formValue4)
                }
                formElement2.discount?.let { formValue4 ->
                  form.add("discounts" + "[" + formIndex2 + "]" + "[discount]", formValue4)
                }
                formElement2.promotionCode?.let { formValue4 ->
                  form.add("discounts" + "[" + formIndex2 + "]" + "[promotion_code]", formValue4)
                }
              }
            }
          }
          formValue0.inlineV1InvoicesLinesPostRequestFormDiscountsAnyOf2X713103e5 != null -> {
            form.add("discounts", requireNotNull(formValue0.inlineV1InvoicesLinesPostRequestFormDiscountsAnyOf2X713103e5).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      request.metadata?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            requireNotNull(formValue0.branch1).forEach { (formKey2, formMapValue2) ->
              val formPrimitive2 = formMapValue2 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
              form.add("metadata" + "[" + formKey2 + "]", formPrimitive2.content)
            }
          }
          formValue0.inlineV1InvoicesLinesPostRequestFormMetadataAnyOf2X524ea29c != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1InvoicesLinesPostRequestFormMetadataAnyOf2X524ea29c).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.period?.let { formValue0 ->
        form.add("period" + "[end]", formValue0.end.toString())
        form.add("period" + "[start]", formValue0.start.toString())
      }
      request.priceData?.let { formValue0 ->
        form.add("price_data" + "[currency]", formValue0.currency)
        formValue0.product?.let { formValue2 ->
          form.add("price_data" + "[product]", formValue2)
        }
        formValue0.productData?.let { formValue2 ->
          formValue2.description?.let { formValue4 ->
            form.add("price_data" + "[product_data]" + "[description]", formValue4)
          }
          formValue2.images?.let { formValue4 ->
            if (formValue4.isEmpty()) {
              form.add("price_data" + "[product_data]" + "[images]", "")
            } else {
              formValue4.forEachIndexed { formIndex5, formElement5 ->
                form.add("price_data" + "[product_data]" + "[images]" + "[" + formIndex5 + "]", formElement5)
              }
            }
          }
          formValue2.metadata?.let { formValue4 ->
            formValue4.forEach { (formKey5, formMapValue5) ->
              form.add("price_data" + "[product_data]" + "[metadata]" + "[" + formKey5 + "]", formMapValue5)
            }
          }
          form.add("price_data" + "[product_data]" + "[name]", formValue2.name)
          formValue2.taxCode?.let { formValue4 ->
            form.add("price_data" + "[product_data]" + "[tax_code]", formValue4)
          }
          formValue2.unitLabel?.let { formValue4 ->
            form.add("price_data" + "[product_data]" + "[unit_label]", formValue4)
          }
        }
        formValue0.taxBehavior?.let { formValue2 ->
          form.add("price_data" + "[tax_behavior]", formValue2.value)
        }
        formValue0.unitAmount?.let { formValue2 ->
          form.add("price_data" + "[unit_amount]", formValue2.toString())
        }
        formValue0.unitAmountDecimal?.let { formValue2 ->
          form.add("price_data" + "[unit_amount_decimal]", formValue2)
        }
      }
      request.pricing?.let { formValue0 ->
        formValue0.price?.let { formValue2 ->
          form.add("pricing" + "[price]", formValue2)
        }
      }
      request.quantity?.let { formValue0 ->
        form.add("quantity", formValue0.toString())
      }
      request.quantityDecimal?.let { formValue0 ->
        form.add("quantity_decimal", formValue0)
      }
      request.taxAmounts?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            if (requireNotNull(formValue0.branch1).isEmpty()) {
              form.add("tax_amounts", "")
            } else {
              requireNotNull(formValue0.branch1).forEachIndexed { formIndex2, formElement2 ->
                form.add("tax_amounts" + "[" + formIndex2 + "]" + "[amount]", formElement2.amount.toString())
                formElement2.taxRateData.country?.let { formValue5 ->
                  form.add("tax_amounts" + "[" + formIndex2 + "]" + "[tax_rate_data]" + "[country]", formValue5)
                }
                formElement2.taxRateData.description?.let { formValue5 ->
                  form.add("tax_amounts" + "[" + formIndex2 + "]" + "[tax_rate_data]" + "[description]", formValue5)
                }
                form.add("tax_amounts" + "[" + formIndex2 + "]" + "[tax_rate_data]" + "[display_name]", formElement2.taxRateData.displayName)
                form.add("tax_amounts" + "[" + formIndex2 + "]" + "[tax_rate_data]" + "[inclusive]", formElement2.taxRateData.inclusive.toString())
                formElement2.taxRateData.jurisdiction?.let { formValue5 ->
                  form.add("tax_amounts" + "[" + formIndex2 + "]" + "[tax_rate_data]" + "[jurisdiction]", formValue5)
                }
                formElement2.taxRateData.jurisdictionLevel?.let { formValue5 ->
                  form.add("tax_amounts" + "[" + formIndex2 + "]" + "[tax_rate_data]" + "[jurisdiction_level]", formValue5.value)
                }
                form.add("tax_amounts" + "[" + formIndex2 + "]" + "[tax_rate_data]" + "[percentage]", formElement2.taxRateData.percentage)
                formElement2.taxRateData.state?.let { formValue5 ->
                  form.add("tax_amounts" + "[" + formIndex2 + "]" + "[tax_rate_data]" + "[state]", formValue5)
                }
                formElement2.taxRateData.taxType?.let { formValue5 ->
                  form.add("tax_amounts" + "[" + formIndex2 + "]" + "[tax_rate_data]" + "[tax_type]", formValue5.value)
                }
                formElement2.taxabilityReason?.let { formValue4 ->
                  form.add("tax_amounts" + "[" + formIndex2 + "]" + "[taxability_reason]", formValue4.value)
                }
                form.add("tax_amounts" + "[" + formIndex2 + "]" + "[taxable_amount]", formElement2.taxableAmount.toString())
              }
            }
          }
          formValue0.inlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf2X965f14bb != null -> {
            form.add("tax_amounts", requireNotNull(formValue0.inlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf2X965f14bb).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.taxRates?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            if (requireNotNull(formValue0.branch1).isEmpty()) {
              form.add("tax_rates", "")
            } else {
              requireNotNull(formValue0.branch1).forEachIndexed { formIndex2, formElement2 ->
                form.add("tax_rates" + "[" + formIndex2 + "]", formElement2)
              }
            }
          }
          formValue0.inlineV1InvoicesLinesPostRequestFormTaxRatesAnyOf2Xd95bc7ed != null -> {
            form.add("tax_rates", requireNotNull(formValue0.inlineV1InvoicesLinesPostRequestFormTaxRatesAnyOf2Xd95bc7ed).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1InvoicesLinesPostRequestFormXeff471a0? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostInvoicesInvoiceMarkUncollectibleFormCodec : MediaTypeCodec<InlineV1InvoicesMarkUncollectiblePostRequestFormX5f3ee136?> {
    override val id: String = "PostInvoicesInvoiceMarkUncollectible.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1InvoicesMarkUncollectiblePostRequestFormX5f3ee136?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1InvoicesMarkUncollectiblePostRequestFormX5f3ee136? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostInvoicesInvoiceRemoveLinesFormCodec : MediaTypeCodec<InlineV1InvoicesRemoveLinesPostRequestFormXfc30f642> {
    override val id: String = "PostInvoicesInvoiceRemoveLines.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1InvoicesRemoveLinesPostRequestFormXfc30f642, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      request.invoiceMetadata?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            requireNotNull(formValue0.branch1).forEach { (formKey2, formMapValue2) ->
              val formPrimitive2 = formMapValue2 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
              form.add("invoice_metadata" + "[" + formKey2 + "]", formPrimitive2.content)
            }
          }
          formValue0.inlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataAnyOf2X0a804ddf != null -> {
            form.add("invoice_metadata", requireNotNull(formValue0.inlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataAnyOf2X0a804ddf).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      if (request.lines.isEmpty()) {
        form.add("lines", "")
      } else {
        request.lines.forEachIndexed { formIndex0, formElement0 ->
          form.add("lines" + "[" + formIndex0 + "]" + "[behavior]", formElement0.behavior.value)
          form.add("lines" + "[" + formIndex0 + "]" + "[id]", formElement0.id)
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1InvoicesRemoveLinesPostRequestFormXfc30f642 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostInvoicesInvoiceSendFormCodec : MediaTypeCodec<InlineV1InvoicesSendPostRequestFormX5abfd413?> {
    override val id: String = "PostInvoicesInvoiceSend.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1InvoicesSendPostRequestFormX5abfd413?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1InvoicesSendPostRequestFormX5abfd413? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostInvoicesInvoiceUpdateLinesFormCodec : MediaTypeCodec<InlineV1InvoicesUpdateLinesPostRequestFormXf374c0fb> {
    override val id: String = "PostInvoicesInvoiceUpdateLines.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1InvoicesUpdateLinesPostRequestFormXf374c0fb, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      request.invoiceMetadata?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            requireNotNull(formValue0.branch1).forEach { (formKey2, formMapValue2) ->
              val formPrimitive2 = formMapValue2 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
              form.add("invoice_metadata" + "[" + formKey2 + "]", formPrimitive2.content)
            }
          }
          formValue0.inlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataAnyOf2X2cda2b70 != null -> {
            form.add("invoice_metadata", requireNotNull(formValue0.inlineV1InvoicesUpdateLinesPostRequestFormInvoiceMetadataAnyOf2X2cda2b70).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      if (request.lines.isEmpty()) {
        form.add("lines", "")
      } else {
        request.lines.forEachIndexed { formIndex0, formElement0 ->
          formElement0.amount?.let { formValue2 ->
            form.add("lines" + "[" + formIndex0 + "]" + "[amount]", formValue2.toString())
          }
          formElement0.description?.let { formValue2 ->
            form.add("lines" + "[" + formIndex0 + "]" + "[description]", formValue2)
          }
          formElement0.discountable?.let { formValue2 ->
            form.add("lines" + "[" + formIndex0 + "]" + "[discountable]", formValue2.toString())
          }
          formElement0.discounts?.let { formValue2 ->
            require(formValue2.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
            when {
              formValue2.branch1 != null -> {
                if (requireNotNull(formValue2.branch1).isEmpty()) {
                  form.add("lines" + "[" + formIndex0 + "]" + "[discounts]", "")
                } else {
                  requireNotNull(formValue2.branch1).forEachIndexed { formIndex4, formElement4 ->
                    formElement4.coupon?.let { formValue6 ->
                      form.add("lines" + "[" + formIndex0 + "]" + "[discounts]" + "[" + formIndex4 + "]" + "[coupon]", formValue6)
                    }
                    formElement4.discount?.let { formValue6 ->
                      form.add("lines" + "[" + formIndex0 + "]" + "[discounts]" + "[" + formIndex4 + "]" + "[discount]", formValue6)
                    }
                    formElement4.promotionCode?.let { formValue6 ->
                      form.add("lines" + "[" + formIndex0 + "]" + "[discounts]" + "[" + formIndex4 + "]" + "[promotion_code]", formValue6)
                    }
                  }
                }
              }
              formValue2.inlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsAnyOf2X0dc7e920 != null -> {
                form.add("lines" + "[" + formIndex0 + "]" + "[discounts]", requireNotNull(formValue2.inlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsAnyOf2X0dc7e920).value)
              }
              else -> {
                error("Form union value has no selected branch")
              }
            }
          }
          form.add("lines" + "[" + formIndex0 + "]" + "[id]", formElement0.id)
          formElement0.metadata?.let { formValue2 ->
            require(formValue2.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
            when {
              formValue2.branch1 != null -> {
                requireNotNull(formValue2.branch1).forEach { (formKey4, formMapValue4) ->
                  val formPrimitive4 = formMapValue4 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
                  form.add("lines" + "[" + formIndex0 + "]" + "[metadata]" + "[" + formKey4 + "]", formPrimitive4.content)
                }
              }
              formValue2.inlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataAnyOf2Xacac53f2 != null -> {
                form.add("lines" + "[" + formIndex0 + "]" + "[metadata]", requireNotNull(formValue2.inlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataAnyOf2Xacac53f2).value)
              }
              else -> {
                error("Form union value has no selected branch")
              }
            }
          }
          formElement0.period?.let { formValue2 ->
            form.add("lines" + "[" + formIndex0 + "]" + "[period]" + "[end]", formValue2.end.toString())
            form.add("lines" + "[" + formIndex0 + "]" + "[period]" + "[start]", formValue2.start.toString())
          }
          formElement0.priceData?.let { formValue2 ->
            form.add("lines" + "[" + formIndex0 + "]" + "[price_data]" + "[currency]", formValue2.currency)
            formValue2.product?.let { formValue4 ->
              form.add("lines" + "[" + formIndex0 + "]" + "[price_data]" + "[product]", formValue4)
            }
            formValue2.productData?.let { formValue4 ->
              formValue4.description?.let { formValue6 ->
                form.add("lines" + "[" + formIndex0 + "]" + "[price_data]" + "[product_data]" + "[description]", formValue6)
              }
              formValue4.images?.let { formValue6 ->
                if (formValue6.isEmpty()) {
                  form.add("lines" + "[" + formIndex0 + "]" + "[price_data]" + "[product_data]" + "[images]", "")
                } else {
                  formValue6.forEachIndexed { formIndex7, formElement7 ->
                    form.add("lines" + "[" + formIndex0 + "]" + "[price_data]" + "[product_data]" + "[images]" + "[" + formIndex7 + "]", formElement7)
                  }
                }
              }
              formValue4.metadata?.let { formValue6 ->
                formValue6.forEach { (formKey7, formMapValue7) ->
                  form.add("lines" + "[" + formIndex0 + "]" + "[price_data]" + "[product_data]" + "[metadata]" + "[" + formKey7 + "]", formMapValue7)
                }
              }
              form.add("lines" + "[" + formIndex0 + "]" + "[price_data]" + "[product_data]" + "[name]", formValue4.name)
              formValue4.taxCode?.let { formValue6 ->
                form.add("lines" + "[" + formIndex0 + "]" + "[price_data]" + "[product_data]" + "[tax_code]", formValue6)
              }
              formValue4.unitLabel?.let { formValue6 ->
                form.add("lines" + "[" + formIndex0 + "]" + "[price_data]" + "[product_data]" + "[unit_label]", formValue6)
              }
            }
            formValue2.taxBehavior?.let { formValue4 ->
              form.add("lines" + "[" + formIndex0 + "]" + "[price_data]" + "[tax_behavior]", formValue4.value)
            }
            formValue2.unitAmount?.let { formValue4 ->
              form.add("lines" + "[" + formIndex0 + "]" + "[price_data]" + "[unit_amount]", formValue4.toString())
            }
            formValue2.unitAmountDecimal?.let { formValue4 ->
              form.add("lines" + "[" + formIndex0 + "]" + "[price_data]" + "[unit_amount_decimal]", formValue4)
            }
          }
          formElement0.pricing?.let { formValue2 ->
            formValue2.price?.let { formValue4 ->
              form.add("lines" + "[" + formIndex0 + "]" + "[pricing]" + "[price]", formValue4)
            }
          }
          formElement0.quantity?.let { formValue2 ->
            form.add("lines" + "[" + formIndex0 + "]" + "[quantity]", formValue2.toString())
          }
          formElement0.quantityDecimal?.let { formValue2 ->
            form.add("lines" + "[" + formIndex0 + "]" + "[quantity_decimal]", formValue2)
          }
          formElement0.taxAmounts?.let { formValue2 ->
            require(formValue2.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
            when {
              formValue2.branch1 != null -> {
                if (requireNotNull(formValue2.branch1).isEmpty()) {
                  form.add("lines" + "[" + formIndex0 + "]" + "[tax_amounts]", "")
                } else {
                  requireNotNull(formValue2.branch1).forEachIndexed { formIndex4, formElement4 ->
                    form.add("lines" + "[" + formIndex0 + "]" + "[tax_amounts]" + "[" + formIndex4 + "]" + "[amount]", formElement4.amount.toString())
                    formElement4.taxRateData.country?.let { formValue7 ->
                      form.add("lines" + "[" + formIndex0 + "]" + "[tax_amounts]" + "[" + formIndex4 + "]" + "[tax_rate_data]" + "[country]", formValue7)
                    }
                    formElement4.taxRateData.description?.let { formValue7 ->
                      form.add("lines" + "[" + formIndex0 + "]" + "[tax_amounts]" + "[" + formIndex4 + "]" + "[tax_rate_data]" + "[description]", formValue7)
                    }
                    form.add("lines" + "[" + formIndex0 + "]" + "[tax_amounts]" + "[" + formIndex4 + "]" + "[tax_rate_data]" + "[display_name]", formElement4.taxRateData.displayName)
                    form.add("lines" + "[" + formIndex0 + "]" + "[tax_amounts]" + "[" + formIndex4 + "]" + "[tax_rate_data]" + "[inclusive]", formElement4.taxRateData.inclusive.toString())
                    formElement4.taxRateData.jurisdiction?.let { formValue7 ->
                      form.add("lines" + "[" + formIndex0 + "]" + "[tax_amounts]" + "[" + formIndex4 + "]" + "[tax_rate_data]" + "[jurisdiction]", formValue7)
                    }
                    formElement4.taxRateData.jurisdictionLevel?.let { formValue7 ->
                      form.add("lines" + "[" + formIndex0 + "]" + "[tax_amounts]" + "[" + formIndex4 + "]" + "[tax_rate_data]" + "[jurisdiction_level]", formValue7.value)
                    }
                    form.add("lines" + "[" + formIndex0 + "]" + "[tax_amounts]" + "[" + formIndex4 + "]" + "[tax_rate_data]" + "[percentage]", formElement4.taxRateData.percentage)
                    formElement4.taxRateData.state?.let { formValue7 ->
                      form.add("lines" + "[" + formIndex0 + "]" + "[tax_amounts]" + "[" + formIndex4 + "]" + "[tax_rate_data]" + "[state]", formValue7)
                    }
                    formElement4.taxRateData.taxType?.let { formValue7 ->
                      form.add("lines" + "[" + formIndex0 + "]" + "[tax_amounts]" + "[" + formIndex4 + "]" + "[tax_rate_data]" + "[tax_type]", formValue7.value)
                    }
                    formElement4.taxabilityReason?.let { formValue6 ->
                      form.add("lines" + "[" + formIndex0 + "]" + "[tax_amounts]" + "[" + formIndex4 + "]" + "[taxability_reason]", formValue6.value)
                    }
                    form.add("lines" + "[" + formIndex0 + "]" + "[tax_amounts]" + "[" + formIndex4 + "]" + "[taxable_amount]", formElement4.taxableAmount.toString())
                  }
                }
              }
              formValue2.inlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxAmountsAnyOf2Xe0a4c3c3 != null -> {
                form.add("lines" + "[" + formIndex0 + "]" + "[tax_amounts]", requireNotNull(formValue2.inlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxAmountsAnyOf2Xe0a4c3c3).value)
              }
              else -> {
                error("Form union value has no selected branch")
              }
            }
          }
          formElement0.taxRates?.let { formValue2 ->
            require(formValue2.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
            when {
              formValue2.branch1 != null -> {
                if (requireNotNull(formValue2.branch1).isEmpty()) {
                  form.add("lines" + "[" + formIndex0 + "]" + "[tax_rates]", "")
                } else {
                  requireNotNull(formValue2.branch1).forEachIndexed { formIndex4, formElement4 ->
                    form.add("lines" + "[" + formIndex0 + "]" + "[tax_rates]" + "[" + formIndex4 + "]", formElement4)
                  }
                }
              }
              formValue2.inlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesAnyOf2X5400a7c8 != null -> {
                form.add("lines" + "[" + formIndex0 + "]" + "[tax_rates]", requireNotNull(formValue2.inlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesAnyOf2X5400a7c8).value)
              }
              else -> {
                error("Form union value has no selected branch")
              }
            }
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1InvoicesUpdateLinesPostRequestFormXf374c0fb {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostInvoicesInvoiceVoidFormCodec : MediaTypeCodec<InlineV1InvoicesVoidPostRequestFormX16ba2a51?> {
    override val id: String = "PostInvoicesInvoiceVoid.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1InvoicesVoidPostRequestFormX16ba2a51?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1InvoicesVoidPostRequestFormX16ba2a51? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'invoices' group of Stripe API.
 */
public class InvoicesClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  authentication: SdkAuthentication? = null,
) {
  private val contractSecuritySchemes: Map<String, SecurityScheme> = mapOf(
        "basicAuth" to SecurityScheme.HttpBasic,
        "bearerAuth" to SecurityScheme.HttpBearer(),
      )

  private val authentication: SdkAuthentication? = authentication ?: SecuritySchemeAuthentication(
        bindings =
          contractSecuritySchemes.mapNotNull { (schemeId, scheme) ->
            credentialProviders[schemeId]?.let { provider -> schemeId to SecuritySchemeBinding(scheme, provider) }
          }.toMap(),
        trustedHosts = trustedHosts ?: TrustedHosts.of(baseUri),
      )

  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@InvoicesClient.authentication)

  /**
   * <p>Permanently deletes a one-off invoice draft. This cannot be undone. Attempts to delete invoices that are no
   * longer in a draft state will fail; once an invoice has been finalized or if an invoice is for a subscription, it
   * must be <a href="/api/invoices/void">voided</a>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param invoice Wire parameter `invoice`.
   * @param options Execution options.
   */
  public suspend fun deleteInvoicesInvoiceWithResponse(
    request: JsonObject? = null,
    invoice: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteInvoicesInvoiceResponse> = executor.executeWithResponse<JsonObject?, DeleteInvoicesInvoiceResponse>(SdkExecutionRequest(deleteInvoicesInvoiceMetadata, baseUri, request, listOf(InvoicesCodecs.DELETEINVOICESINVOICE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "invoice", values = listOf(invoice.toString())))
  }), InvoicesCodecs.deleteInvoicesInvoiceRequestCodecRegistry, DeleteInvoicesInvoiceResponseDecoder, options)

  /**
   * <p>You can list all invoices, or list the invoices for a specific customer. The invoices are returned sorted by
   * creation date, with the most recently created invoices appearing first.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param collectionMethod The collection method of the invoice to retrieve. Either `charge_automatically` or
   * `send_invoice`.
   * @param created Only return invoices that were created during the given date interval.
   * @param customer Only return invoices for the customer specified by this customer ID.
   * @param customerAccount Only return invoices for the account representing the customer specified by this account ID.
   * @param dueDate Wire parameter `due_date`.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param status The status of the invoice, one of `draft`, `open`, `paid`, `uncollectible`, or `void`. [Learn
   * more](https://docs.stripe.com/billing/invoices/workflow#workflow-overview)
   * @param subscription Only return invoices for the subscription specified by this subscription ID.
   * @param options Execution options.
   */
  public suspend fun getInvoicesWithResponse(
    request: JsonObject? = null,
    collectionMethod: InlineV1InvoicesGetParameterX615bb39b? = null,
    created: InlineV1InvoicesGetParameterX5346dfcd? = null,
    customer: String? = null,
    customerAccount: String? = null,
    dueDate: InlineV1InvoicesGetParameterXb8e276b5? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    status: InlineV1InvoicesGetParameterX751afae8? = null,
    subscription: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetInvoicesResponse> = executor.executeWithResponse<JsonObject?, GetInvoicesResponse>(SdkExecutionRequest(getInvoicesMetadata, baseUri, request, listOf(InvoicesCodecs.GETINVOICES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "collection_method", values = collectionMethod?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created", values = created?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "customer", values = customer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "customer_account", values = customerAccount?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "due_date", values = dueDate?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "status", values = status?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "subscription", values = subscription?.let { listOf(it.toString()) }.orEmpty()))
  }), InvoicesCodecs.getInvoicesRequestCodecRegistry, GetInvoicesResponseDecoder, options)

  /**
   * <p>Retrieves the invoice with the given ID.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param invoice Wire parameter `invoice`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getInvoicesInvoiceWithResponse(
    request: JsonObject? = null,
    invoice: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetInvoicesInvoiceResponse> = executor.executeWithResponse<JsonObject?, GetInvoicesInvoiceResponse>(SdkExecutionRequest(getInvoicesInvoiceMetadata, baseUri, request, listOf(InvoicesCodecs.GETINVOICESINVOICE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "invoice", values = listOf(invoice.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), InvoicesCodecs.getInvoicesInvoiceRequestCodecRegistry, GetInvoicesInvoiceResponseDecoder, options)

  /**
   * <p>When retrieving an invoice, you’ll get a <strong>lines</strong> property containing the total count of line
   * items and the first handful of those items. There is also a URL where you can retrieve the full (paginated) list of
   * line items.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param invoice Wire parameter `invoice`.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param options Execution options.
   */
  public suspend fun getInvoicesInvoiceLinesWithResponse(
    request: JsonObject? = null,
    invoice: String,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetInvoicesInvoiceLinesResponse> = executor.executeWithResponse<JsonObject?, GetInvoicesInvoiceLinesResponse>(SdkExecutionRequest(getInvoicesInvoiceLinesMetadata, baseUri, request, listOf(InvoicesCodecs.GETINVOICESINVOICELINES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "invoice", values = listOf(invoice.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), InvoicesCodecs.getInvoicesInvoiceLinesRequestCodecRegistry, GetInvoicesInvoiceLinesResponseDecoder, options)

  /**
   * <p>Search for invoices you’ve previously created using Stripe’s <a href="/docs/search#search-query-language">Search
   * Query Language</a>.
   * Don’t use search in read-after-write flows where strict consistency is necessary. Under normal operating
   * conditions, data is searchable in less than a minute. Occasionally, propagation of new or updated data can be up
   * to an hour behind during outages. Search functionality is not available to merchants in India.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param page A cursor for pagination across multiple pages of results. Don't include this parameter on the first
   * call. Use the next_page value returned in a previous response to request subsequent results.
   * @param query The search query string. See [search query
   * language](https://docs.stripe.com/search#search-query-language) and the list of supported [query fields for
   * invoices](https://docs.stripe.com/search#query-fields-for-invoices).
   * @param options Execution options.
   */
  public suspend fun getInvoicesSearchWithResponse(
    request: JsonObject? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    page: String? = null,
    query: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetInvoicesSearchResponse> = executor.executeWithResponse<JsonObject?, GetInvoicesSearchResponse>(SdkExecutionRequest(getInvoicesSearchMetadata, baseUri, request, listOf(InvoicesCodecs.GETINVOICESSEARCH_REQUEST_CODEC_ID), buildList {
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "query", values = listOf(query.toString())))
  }), InvoicesCodecs.getInvoicesSearchRequestCodecRegistry, GetInvoicesSearchResponseDecoder, options)

  /**
   * <p>Adds multiple line items to an invoice. This is only possible when an invoice is still a draft.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param invoice Wire parameter `invoice`.
   * @param options Execution options.
   */
  public suspend fun postInvoicesInvoiceAddLinesWithResponse(
    request: InlineV1InvoicesAddLinesPostRequestFormX5fcd6d4a,
    invoice: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostInvoicesInvoiceAddLinesResponse> = executor.executeWithResponse<InlineV1InvoicesAddLinesPostRequestFormX5fcd6d4a, PostInvoicesInvoiceAddLinesResponse>(SdkExecutionRequest(postInvoicesInvoiceAddLinesMetadata, baseUri, request, listOf(InvoicesCodecs.POSTINVOICESINVOICEADDLINES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "invoice", values = listOf(invoice.toString())))
  }), InvoicesCodecs.postInvoicesInvoiceAddLinesRequestCodecRegistry, PostInvoicesInvoiceAddLinesResponseDecoder, options)

  /**
   * <p>Attaches a PaymentIntent or an Out of Band Payment to the invoice, adding it to the list of
   * <code>payments</code>.</p>
   *
   * <p>For the PaymentIntent, when the PaymentIntent’s status changes to <code>succeeded</code>, the payment is
   * credited
   * to the invoice, increasing its <code>amount_paid</code>. When the invoice is fully paid, the
   * invoice’s status becomes <code>paid</code>.</p>
   *
   * <p>If the PaymentIntent’s status is already <code>succeeded</code> when it’s attached, it’s
   * credited to the invoice immediately.</p>
   *
   * <p>See: <a href="/docs/invoicing/partial-payments">Partial payments</a> to learn more.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param invoice Wire parameter `invoice`.
   * @param options Execution options.
   */
  public suspend fun postInvoicesInvoiceAttachPaymentWithResponse(
    request: InlineV1InvoicesAttachPaymentPostRequestFormX4b78a621? = null,
    invoice: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostInvoicesInvoiceAttachPaymentResponse> = executor.executeWithResponse<InlineV1InvoicesAttachPaymentPostRequestFormX4b78a621?, PostInvoicesInvoiceAttachPaymentResponse>(SdkExecutionRequest(postInvoicesInvoiceAttachPaymentMetadata, baseUri, request, listOf(InvoicesCodecs.POSTINVOICESINVOICEATTACHPAYMENT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "invoice", values = listOf(invoice.toString())))
  }), InvoicesCodecs.postInvoicesInvoiceAttachPaymentRequestCodecRegistry, PostInvoicesInvoiceAttachPaymentResponseDecoder, options)

  /**
   * <p>Stripe automatically finalizes drafts before sending and attempting payment on invoices. However, if you’d like
   * to finalize a draft invoice manually, you can do so using this method.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param invoice Wire parameter `invoice`.
   * @param options Execution options.
   */
  public suspend fun postInvoicesInvoiceFinalizeWithResponse(
    request: InlineV1InvoicesFinalizePostRequestFormXef2b05e1? = null,
    invoice: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostInvoicesInvoiceFinalizeResponse> = executor.executeWithResponse<InlineV1InvoicesFinalizePostRequestFormXef2b05e1?, PostInvoicesInvoiceFinalizeResponse>(SdkExecutionRequest(postInvoicesInvoiceFinalizeMetadata, baseUri, request, listOf(InvoicesCodecs.POSTINVOICESINVOICEFINALIZE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "invoice", values = listOf(invoice.toString())))
  }), InvoicesCodecs.postInvoicesInvoiceFinalizeRequestCodecRegistry, PostInvoicesInvoiceFinalizeResponseDecoder, options)

  /**
   * <p>Updates an invoice’s line item. Some fields, such as <code>tax_amounts</code>, only live on the invoice line
   * item,
   * so they can only be updated through this endpoint. Other fields, such as <code>amount</code>, live on both the
   * invoice
   * item and the invoice line item, so updates on this endpoint will propagate to the invoice item as well.
   * Updating an invoice’s line item is only possible before the invoice is finalized.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param invoice Invoice ID of line item
   * @param lineItemId Invoice line item ID
   * @param options Execution options.
   */
  public suspend fun postInvoicesInvoiceLinesLineItemIdWithResponse(
    request: InlineV1InvoicesLinesPostRequestFormXeff471a0? = null,
    invoice: String,
    lineItemId: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostInvoicesInvoiceLinesLineItemIdResponse> = executor.executeWithResponse<InlineV1InvoicesLinesPostRequestFormXeff471a0?, PostInvoicesInvoiceLinesLineItemIdResponse>(SdkExecutionRequest(postInvoicesInvoiceLinesLineItemIdMetadata, baseUri, request, listOf(InvoicesCodecs.POSTINVOICESINVOICELINESLINEITEMID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "invoice", values = listOf(invoice.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "line_item_id", values = listOf(lineItemId.toString())))
  }), InvoicesCodecs.postInvoicesInvoiceLinesLineItemIdRequestCodecRegistry, PostInvoicesInvoiceLinesLineItemIdResponseDecoder, options)

  /**
   * <p>Marking an invoice as uncollectible is useful for keeping track of bad debts that can be written off for
   * accounting purposes.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param invoice Wire parameter `invoice`.
   * @param options Execution options.
   */
  public suspend fun postInvoicesInvoiceMarkUncollectibleWithResponse(
    request: InlineV1InvoicesMarkUncollectiblePostRequestFormX5f3ee136? = null,
    invoice: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostInvoicesInvoiceMarkUncollectibleResponse> = executor.executeWithResponse<InlineV1InvoicesMarkUncollectiblePostRequestFormX5f3ee136?, PostInvoicesInvoiceMarkUncollectibleResponse>(SdkExecutionRequest(postInvoicesInvoiceMarkUncollectibleMetadata, baseUri, request, listOf(InvoicesCodecs.POSTINVOICESINVOICEMARKUNCOLLECTIBLE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "invoice", values = listOf(invoice.toString())))
  }), InvoicesCodecs.postInvoicesInvoiceMarkUncollectibleRequestCodecRegistry, PostInvoicesInvoiceMarkUncollectibleResponseDecoder, options)

  /**
   * <p>Removes multiple line items from an invoice. This is only possible when an invoice is still a draft.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param invoice Wire parameter `invoice`.
   * @param options Execution options.
   */
  public suspend fun postInvoicesInvoiceRemoveLinesWithResponse(
    request: InlineV1InvoicesRemoveLinesPostRequestFormXfc30f642,
    invoice: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostInvoicesInvoiceRemoveLinesResponse> = executor.executeWithResponse<InlineV1InvoicesRemoveLinesPostRequestFormXfc30f642, PostInvoicesInvoiceRemoveLinesResponse>(SdkExecutionRequest(postInvoicesInvoiceRemoveLinesMetadata, baseUri, request, listOf(InvoicesCodecs.POSTINVOICESINVOICEREMOVELINES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "invoice", values = listOf(invoice.toString())))
  }), InvoicesCodecs.postInvoicesInvoiceRemoveLinesRequestCodecRegistry, PostInvoicesInvoiceRemoveLinesResponseDecoder, options)

  /**
   * <p>Stripe will automatically send invoices to customers according to your <a
   * href="https://dashboard.stripe.com/account/billing/automatic">subscriptions settings</a>. However, if you’d like to
   * manually send an invoice to your customer out of the normal schedule, you can do so. When sending invoices that
   * have already been paid, there will be no reference to the payment in the email.</p>
   *
   * <p>Requests made in test-mode result in no emails being sent, despite sending an <code>invoice.sent</code>
   * event.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param invoice Wire parameter `invoice`.
   * @param options Execution options.
   */
  public suspend fun postInvoicesInvoiceSendWithResponse(
    request: InlineV1InvoicesSendPostRequestFormX5abfd413? = null,
    invoice: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostInvoicesInvoiceSendResponse> = executor.executeWithResponse<InlineV1InvoicesSendPostRequestFormX5abfd413?, PostInvoicesInvoiceSendResponse>(SdkExecutionRequest(postInvoicesInvoiceSendMetadata, baseUri, request, listOf(InvoicesCodecs.POSTINVOICESINVOICESEND_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "invoice", values = listOf(invoice.toString())))
  }), InvoicesCodecs.postInvoicesInvoiceSendRequestCodecRegistry, PostInvoicesInvoiceSendResponseDecoder, options)

  /**
   * <p>Updates multiple line items on an invoice. This is only possible when an invoice is still a draft.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param invoice Wire parameter `invoice`.
   * @param options Execution options.
   */
  public suspend fun postInvoicesInvoiceUpdateLinesWithResponse(
    request: InlineV1InvoicesUpdateLinesPostRequestFormXf374c0fb,
    invoice: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostInvoicesInvoiceUpdateLinesResponse> = executor.executeWithResponse<InlineV1InvoicesUpdateLinesPostRequestFormXf374c0fb, PostInvoicesInvoiceUpdateLinesResponse>(SdkExecutionRequest(postInvoicesInvoiceUpdateLinesMetadata, baseUri, request, listOf(InvoicesCodecs.POSTINVOICESINVOICEUPDATELINES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "invoice", values = listOf(invoice.toString())))
  }), InvoicesCodecs.postInvoicesInvoiceUpdateLinesRequestCodecRegistry, PostInvoicesInvoiceUpdateLinesResponseDecoder, options)

  /**
   * <p>Mark a finalized invoice as void. This cannot be undone. Voiding an invoice is similar to <a
   * href="/api/invoices/delete">deletion</a>, however it only applies to finalized invoices and maintains a papertrail
   * where the invoice can still be found.</p>
   *
   * <p>Consult with local regulations to determine whether and how an invoice might be amended, canceled, or voided in
   * the jurisdiction you’re doing business in. You might need to <a href="/api/invoices/create">issue another
   * invoice</a> or <a href="/api/credit_notes/create">credit note</a> instead. Stripe recommends that you consult with
   * your legal counsel for advice specific to your business.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param invoice Wire parameter `invoice`.
   * @param options Execution options.
   */
  public suspend fun postInvoicesInvoiceVoidWithResponse(
    request: InlineV1InvoicesVoidPostRequestFormX16ba2a51? = null,
    invoice: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostInvoicesInvoiceVoidResponse> = executor.executeWithResponse<InlineV1InvoicesVoidPostRequestFormX16ba2a51?, PostInvoicesInvoiceVoidResponse>(SdkExecutionRequest(postInvoicesInvoiceVoidMetadata, baseUri, request, listOf(InvoicesCodecs.POSTINVOICESINVOICEVOID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "invoice", values = listOf(invoice.toString())))
  }), InvoicesCodecs.postInvoicesInvoiceVoidRequestCodecRegistry, PostInvoicesInvoiceVoidResponseDecoder, options)

  /**
   * Typed response alternatives for `DeleteInvoicesInvoice`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface DeleteInvoicesInvoiceResponse {
    public class SuccessJson(
      public val json: DeletedInvoice,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteInvoicesInvoiceResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteInvoicesInvoiceResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteInvoicesInvoiceResponse
  }

  private object DeleteInvoicesInvoiceResponseDecoder : SdkResponseAlternativeDecoder<DeleteInvoicesInvoiceResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteInvoicesInvoiceResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteInvoicesInvoiceResponse> = when {
      alternative.id == "DeleteInvoicesInvoice.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteInvoicesInvoiceResponse.SuccessJson(
          json = InvoicesCodecs.deleteInvoicesInvoiceResponseCodecAlternative0Registry.select(listOf("DeleteInvoicesInvoice.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "DeleteInvoicesInvoice.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteInvoicesInvoiceResponse.DefaultJson(
          json = InvoicesCodecs.deleteInvoicesInvoiceResponseCodecAlternative1Registry.select(listOf("DeleteInvoicesInvoice.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): DeleteInvoicesInvoiceResponse = DeleteInvoicesInvoiceResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetInvoices`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetInvoicesResponse {
    public class SuccessJson(
      public val json: InlineV1InvoicesGetResponse200JsonXa7c172e4,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetInvoicesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetInvoicesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetInvoicesResponse
  }

  private object GetInvoicesResponseDecoder : SdkResponseAlternativeDecoder<GetInvoicesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetInvoicesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetInvoicesResponse> = when {
      alternative.id == "GetInvoices.response.alternative0" -> SdkResponseDecodeResult(
        value = GetInvoicesResponse.SuccessJson(
          json = InvoicesCodecs.getInvoicesResponseCodecAlternative0Registry.select(listOf("GetInvoices.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetInvoices.response.alternative1" -> SdkResponseDecodeResult(
        value = GetInvoicesResponse.DefaultJson(
          json = InvoicesCodecs.getInvoicesResponseCodecAlternative1Registry.select(listOf("GetInvoices.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): GetInvoicesResponse = GetInvoicesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetInvoicesInvoice`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetInvoicesInvoiceResponse {
    public class SuccessJson(
      public val json: Invoice,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetInvoicesInvoiceResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetInvoicesInvoiceResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetInvoicesInvoiceResponse
  }

  private object GetInvoicesInvoiceResponseDecoder : SdkResponseAlternativeDecoder<GetInvoicesInvoiceResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetInvoicesInvoiceResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetInvoicesInvoiceResponse> = when {
      alternative.id == "GetInvoicesInvoice.response.alternative0" -> SdkResponseDecodeResult(
        value = GetInvoicesInvoiceResponse.SuccessJson(
          json = InvoicesCodecs.getInvoicesInvoiceResponseCodecAlternative0Registry.select(listOf("GetInvoicesInvoice.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetInvoicesInvoice.response.alternative1" -> SdkResponseDecodeResult(
        value = GetInvoicesInvoiceResponse.DefaultJson(
          json = InvoicesCodecs.getInvoicesInvoiceResponseCodecAlternative1Registry.select(listOf("GetInvoicesInvoice.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): GetInvoicesInvoiceResponse = GetInvoicesInvoiceResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetInvoicesInvoiceLines`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetInvoicesInvoiceLinesResponse {
    public class SuccessJson(
      public val json: InlineV1InvoicesLinesGetResponse200JsonXf5c237ad,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetInvoicesInvoiceLinesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetInvoicesInvoiceLinesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetInvoicesInvoiceLinesResponse
  }

  private object GetInvoicesInvoiceLinesResponseDecoder : SdkResponseAlternativeDecoder<GetInvoicesInvoiceLinesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetInvoicesInvoiceLinesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetInvoicesInvoiceLinesResponse> = when {
      alternative.id == "GetInvoicesInvoiceLines.response.alternative0" -> SdkResponseDecodeResult(
        value = GetInvoicesInvoiceLinesResponse.SuccessJson(
          json = InvoicesCodecs.getInvoicesInvoiceLinesResponseCodecAlternative0Registry.select(listOf("GetInvoicesInvoiceLines.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetInvoicesInvoiceLines.response.alternative1" -> SdkResponseDecodeResult(
        value = GetInvoicesInvoiceLinesResponse.DefaultJson(
          json = InvoicesCodecs.getInvoicesInvoiceLinesResponseCodecAlternative1Registry.select(listOf("GetInvoicesInvoiceLines.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): GetInvoicesInvoiceLinesResponse = GetInvoicesInvoiceLinesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetInvoicesSearch`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetInvoicesSearchResponse {
    public class SuccessJson(
      public val json: InlineV1InvoicesSearchGetResponse200JsonX2e73b6f3,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetInvoicesSearchResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetInvoicesSearchResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetInvoicesSearchResponse
  }

  private object GetInvoicesSearchResponseDecoder : SdkResponseAlternativeDecoder<GetInvoicesSearchResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetInvoicesSearchResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetInvoicesSearchResponse> = when {
      alternative.id == "GetInvoicesSearch.response.alternative0" -> SdkResponseDecodeResult(
        value = GetInvoicesSearchResponse.SuccessJson(
          json = InvoicesCodecs.getInvoicesSearchResponseCodecAlternative0Registry.select(listOf("GetInvoicesSearch.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetInvoicesSearch.response.alternative1" -> SdkResponseDecodeResult(
        value = GetInvoicesSearchResponse.DefaultJson(
          json = InvoicesCodecs.getInvoicesSearchResponseCodecAlternative1Registry.select(listOf("GetInvoicesSearch.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): GetInvoicesSearchResponse = GetInvoicesSearchResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostInvoicesInvoiceAddLines`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostInvoicesInvoiceAddLinesResponse {
    public class SuccessJson(
      public val json: Invoice,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostInvoicesInvoiceAddLinesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostInvoicesInvoiceAddLinesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostInvoicesInvoiceAddLinesResponse
  }

  private object PostInvoicesInvoiceAddLinesResponseDecoder : SdkResponseAlternativeDecoder<PostInvoicesInvoiceAddLinesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostInvoicesInvoiceAddLinesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostInvoicesInvoiceAddLinesResponse> = when {
      alternative.id == "PostInvoicesInvoiceAddLines.response.alternative0" -> SdkResponseDecodeResult(
        value = PostInvoicesInvoiceAddLinesResponse.SuccessJson(
          json = InvoicesCodecs.postInvoicesInvoiceAddLinesResponseCodecAlternative0Registry.select(listOf("PostInvoicesInvoiceAddLines.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostInvoicesInvoiceAddLines.response.alternative1" -> SdkResponseDecodeResult(
        value = PostInvoicesInvoiceAddLinesResponse.DefaultJson(
          json = InvoicesCodecs.postInvoicesInvoiceAddLinesResponseCodecAlternative1Registry.select(listOf("PostInvoicesInvoiceAddLines.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PostInvoicesInvoiceAddLinesResponse = PostInvoicesInvoiceAddLinesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostInvoicesInvoiceAttachPayment`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostInvoicesInvoiceAttachPaymentResponse {
    public class SuccessJson(
      public val json: Invoice,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostInvoicesInvoiceAttachPaymentResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostInvoicesInvoiceAttachPaymentResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostInvoicesInvoiceAttachPaymentResponse
  }

  private object PostInvoicesInvoiceAttachPaymentResponseDecoder : SdkResponseAlternativeDecoder<PostInvoicesInvoiceAttachPaymentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostInvoicesInvoiceAttachPaymentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostInvoicesInvoiceAttachPaymentResponse> = when {
      alternative.id == "PostInvoicesInvoiceAttachPayment.response.alternative0" -> SdkResponseDecodeResult(
        value = PostInvoicesInvoiceAttachPaymentResponse.SuccessJson(
          json = InvoicesCodecs.postInvoicesInvoiceAttachPaymentResponseCodecAlternative0Registry.select(listOf("PostInvoicesInvoiceAttachPayment.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostInvoicesInvoiceAttachPayment.response.alternative1" -> SdkResponseDecodeResult(
        value = PostInvoicesInvoiceAttachPaymentResponse.DefaultJson(
          json = InvoicesCodecs.postInvoicesInvoiceAttachPaymentResponseCodecAlternative1Registry.select(listOf("PostInvoicesInvoiceAttachPayment.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PostInvoicesInvoiceAttachPaymentResponse = PostInvoicesInvoiceAttachPaymentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostInvoicesInvoiceFinalize`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostInvoicesInvoiceFinalizeResponse {
    public class SuccessJson(
      public val json: Invoice,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostInvoicesInvoiceFinalizeResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostInvoicesInvoiceFinalizeResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostInvoicesInvoiceFinalizeResponse
  }

  private object PostInvoicesInvoiceFinalizeResponseDecoder : SdkResponseAlternativeDecoder<PostInvoicesInvoiceFinalizeResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostInvoicesInvoiceFinalizeResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostInvoicesInvoiceFinalizeResponse> = when {
      alternative.id == "PostInvoicesInvoiceFinalize.response.alternative0" -> SdkResponseDecodeResult(
        value = PostInvoicesInvoiceFinalizeResponse.SuccessJson(
          json = InvoicesCodecs.postInvoicesInvoiceFinalizeResponseCodecAlternative0Registry.select(listOf("PostInvoicesInvoiceFinalize.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostInvoicesInvoiceFinalize.response.alternative1" -> SdkResponseDecodeResult(
        value = PostInvoicesInvoiceFinalizeResponse.DefaultJson(
          json = InvoicesCodecs.postInvoicesInvoiceFinalizeResponseCodecAlternative1Registry.select(listOf("PostInvoicesInvoiceFinalize.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PostInvoicesInvoiceFinalizeResponse = PostInvoicesInvoiceFinalizeResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostInvoicesInvoiceLinesLineItemId`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface PostInvoicesInvoiceLinesLineItemIdResponse {
    public class SuccessJson(
      public val json: LineItem,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostInvoicesInvoiceLinesLineItemIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostInvoicesInvoiceLinesLineItemIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostInvoicesInvoiceLinesLineItemIdResponse
  }

  private object PostInvoicesInvoiceLinesLineItemIdResponseDecoder : SdkResponseAlternativeDecoder<PostInvoicesInvoiceLinesLineItemIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostInvoicesInvoiceLinesLineItemIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostInvoicesInvoiceLinesLineItemIdResponse> = when {
      alternative.id == "PostInvoicesInvoiceLinesLineItemId.response.alternative0" -> SdkResponseDecodeResult(
        value = PostInvoicesInvoiceLinesLineItemIdResponse.SuccessJson(
          json = InvoicesCodecs.postInvoicesInvoiceLinesLineItemIdResponseCodecAlternative0Registry.select(listOf("PostInvoicesInvoiceLinesLineItemId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostInvoicesInvoiceLinesLineItemId.response.alternative1" -> SdkResponseDecodeResult(
        value = PostInvoicesInvoiceLinesLineItemIdResponse.DefaultJson(
          json = InvoicesCodecs.postInvoicesInvoiceLinesLineItemIdResponseCodecAlternative1Registry.select(listOf("PostInvoicesInvoiceLinesLineItemId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PostInvoicesInvoiceLinesLineItemIdResponse = PostInvoicesInvoiceLinesLineItemIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostInvoicesInvoiceMarkUncollectible`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface PostInvoicesInvoiceMarkUncollectibleResponse {
    public class SuccessJson(
      public val json: Invoice,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostInvoicesInvoiceMarkUncollectibleResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostInvoicesInvoiceMarkUncollectibleResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostInvoicesInvoiceMarkUncollectibleResponse
  }

  private object PostInvoicesInvoiceMarkUncollectibleResponseDecoder : SdkResponseAlternativeDecoder<PostInvoicesInvoiceMarkUncollectibleResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostInvoicesInvoiceMarkUncollectibleResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostInvoicesInvoiceMarkUncollectibleResponse> = when {
      alternative.id == "PostInvoicesInvoiceMarkUncollectible.response.alternative0" -> SdkResponseDecodeResult(
        value = PostInvoicesInvoiceMarkUncollectibleResponse.SuccessJson(
          json = InvoicesCodecs.postInvoicesInvoiceMarkUncollectibleResponseCodecAlternative0Registry.select(listOf("PostInvoicesInvoiceMarkUncollectible.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostInvoicesInvoiceMarkUncollectible.response.alternative1" -> SdkResponseDecodeResult(
        value = PostInvoicesInvoiceMarkUncollectibleResponse.DefaultJson(
          json = InvoicesCodecs.postInvoicesInvoiceMarkUncollectibleResponseCodecAlternative1Registry.select(listOf("PostInvoicesInvoiceMarkUncollectible.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PostInvoicesInvoiceMarkUncollectibleResponse = PostInvoicesInvoiceMarkUncollectibleResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostInvoicesInvoiceRemoveLines`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostInvoicesInvoiceRemoveLinesResponse {
    public class SuccessJson(
      public val json: Invoice,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostInvoicesInvoiceRemoveLinesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostInvoicesInvoiceRemoveLinesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostInvoicesInvoiceRemoveLinesResponse
  }

  private object PostInvoicesInvoiceRemoveLinesResponseDecoder : SdkResponseAlternativeDecoder<PostInvoicesInvoiceRemoveLinesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostInvoicesInvoiceRemoveLinesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostInvoicesInvoiceRemoveLinesResponse> = when {
      alternative.id == "PostInvoicesInvoiceRemoveLines.response.alternative0" -> SdkResponseDecodeResult(
        value = PostInvoicesInvoiceRemoveLinesResponse.SuccessJson(
          json = InvoicesCodecs.postInvoicesInvoiceRemoveLinesResponseCodecAlternative0Registry.select(listOf("PostInvoicesInvoiceRemoveLines.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostInvoicesInvoiceRemoveLines.response.alternative1" -> SdkResponseDecodeResult(
        value = PostInvoicesInvoiceRemoveLinesResponse.DefaultJson(
          json = InvoicesCodecs.postInvoicesInvoiceRemoveLinesResponseCodecAlternative1Registry.select(listOf("PostInvoicesInvoiceRemoveLines.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PostInvoicesInvoiceRemoveLinesResponse = PostInvoicesInvoiceRemoveLinesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostInvoicesInvoiceSend`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostInvoicesInvoiceSendResponse {
    public class SuccessJson(
      public val json: Invoice,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostInvoicesInvoiceSendResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostInvoicesInvoiceSendResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostInvoicesInvoiceSendResponse
  }

  private object PostInvoicesInvoiceSendResponseDecoder : SdkResponseAlternativeDecoder<PostInvoicesInvoiceSendResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostInvoicesInvoiceSendResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostInvoicesInvoiceSendResponse> = when {
      alternative.id == "PostInvoicesInvoiceSend.response.alternative0" -> SdkResponseDecodeResult(
        value = PostInvoicesInvoiceSendResponse.SuccessJson(
          json = InvoicesCodecs.postInvoicesInvoiceSendResponseCodecAlternative0Registry.select(listOf("PostInvoicesInvoiceSend.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostInvoicesInvoiceSend.response.alternative1" -> SdkResponseDecodeResult(
        value = PostInvoicesInvoiceSendResponse.DefaultJson(
          json = InvoicesCodecs.postInvoicesInvoiceSendResponseCodecAlternative1Registry.select(listOf("PostInvoicesInvoiceSend.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PostInvoicesInvoiceSendResponse = PostInvoicesInvoiceSendResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostInvoicesInvoiceUpdateLines`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostInvoicesInvoiceUpdateLinesResponse {
    public class SuccessJson(
      public val json: Invoice,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostInvoicesInvoiceUpdateLinesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostInvoicesInvoiceUpdateLinesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostInvoicesInvoiceUpdateLinesResponse
  }

  private object PostInvoicesInvoiceUpdateLinesResponseDecoder : SdkResponseAlternativeDecoder<PostInvoicesInvoiceUpdateLinesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostInvoicesInvoiceUpdateLinesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostInvoicesInvoiceUpdateLinesResponse> = when {
      alternative.id == "PostInvoicesInvoiceUpdateLines.response.alternative0" -> SdkResponseDecodeResult(
        value = PostInvoicesInvoiceUpdateLinesResponse.SuccessJson(
          json = InvoicesCodecs.postInvoicesInvoiceUpdateLinesResponseCodecAlternative0Registry.select(listOf("PostInvoicesInvoiceUpdateLines.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostInvoicesInvoiceUpdateLines.response.alternative1" -> SdkResponseDecodeResult(
        value = PostInvoicesInvoiceUpdateLinesResponse.DefaultJson(
          json = InvoicesCodecs.postInvoicesInvoiceUpdateLinesResponseCodecAlternative1Registry.select(listOf("PostInvoicesInvoiceUpdateLines.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PostInvoicesInvoiceUpdateLinesResponse = PostInvoicesInvoiceUpdateLinesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostInvoicesInvoiceVoid`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostInvoicesInvoiceVoidResponse {
    public class SuccessJson(
      public val json: Invoice,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostInvoicesInvoiceVoidResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostInvoicesInvoiceVoidResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostInvoicesInvoiceVoidResponse
  }

  private object PostInvoicesInvoiceVoidResponseDecoder : SdkResponseAlternativeDecoder<PostInvoicesInvoiceVoidResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostInvoicesInvoiceVoidResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostInvoicesInvoiceVoidResponse> = when {
      alternative.id == "PostInvoicesInvoiceVoid.response.alternative0" -> SdkResponseDecodeResult(
        value = PostInvoicesInvoiceVoidResponse.SuccessJson(
          json = InvoicesCodecs.postInvoicesInvoiceVoidResponseCodecAlternative0Registry.select(listOf("PostInvoicesInvoiceVoid.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostInvoicesInvoiceVoid.response.alternative1" -> SdkResponseDecodeResult(
        value = PostInvoicesInvoiceVoidResponse.DefaultJson(
          json = InvoicesCodecs.postInvoicesInvoiceVoidResponseCodecAlternative1Registry.select(listOf("PostInvoicesInvoiceVoid.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PostInvoicesInvoiceVoidResponse = PostInvoicesInvoiceVoidResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val deleteInvoicesInvoiceMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "DeleteInvoicesInvoice",
          method = "DELETE",
          path = "/v1/invoices/{invoice}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DeletedInvoice",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteInvoicesInvoice.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteInvoicesInvoice.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
          safety = OperationSafety(safe = false, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val getInvoicesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetInvoices",
          method = "GET",
          path = "/v1/invoices",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1InvoicesGetResponse200JsonXa7c172e4",
              mode = SdkResponseMode.BUFFERED,
              id = "GetInvoices.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetInvoices.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val getInvoicesInvoiceMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetInvoicesInvoice",
          method = "GET",
          path = "/v1/invoices/{invoice}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Invoice",
              mode = SdkResponseMode.BUFFERED,
              id = "GetInvoicesInvoice.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetInvoicesInvoice.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val getInvoicesInvoiceLinesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetInvoicesInvoiceLines",
          method = "GET",
          path = "/v1/invoices/{invoice}/lines",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1InvoicesLinesGetResponse200JsonXf5c237ad",
              mode = SdkResponseMode.BUFFERED,
              id = "GetInvoicesInvoiceLines.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetInvoicesInvoiceLines.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val getInvoicesSearchMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetInvoicesSearch",
          method = "GET",
          path = "/v1/invoices/search",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1InvoicesSearchGetResponse200JsonX2e73b6f3",
              mode = SdkResponseMode.BUFFERED,
              id = "GetInvoicesSearch.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetInvoicesSearch.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val postInvoicesInvoiceAddLinesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostInvoicesInvoiceAddLines",
          method = "POST",
          path = "/v1/invoices/{invoice}/add_lines",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Invoice",
              mode = SdkResponseMode.BUFFERED,
              id = "PostInvoicesInvoiceAddLines.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostInvoicesInvoiceAddLines.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
          safety = OperationSafety(safe = false, idempotent = false),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = false,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val postInvoicesInvoiceAttachPaymentMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostInvoicesInvoiceAttachPayment",
          method = "POST",
          path = "/v1/invoices/{invoice}/attach_payment",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Invoice",
              mode = SdkResponseMode.BUFFERED,
              id = "PostInvoicesInvoiceAttachPayment.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostInvoicesInvoiceAttachPayment.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
          safety = OperationSafety(safe = false, idempotent = false),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = false,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val postInvoicesInvoiceFinalizeMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostInvoicesInvoiceFinalize",
          method = "POST",
          path = "/v1/invoices/{invoice}/finalize",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Invoice",
              mode = SdkResponseMode.BUFFERED,
              id = "PostInvoicesInvoiceFinalize.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostInvoicesInvoiceFinalize.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
          safety = OperationSafety(safe = false, idempotent = false),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = false,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val postInvoicesInvoiceLinesLineItemIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostInvoicesInvoiceLinesLineItemId",
          method = "POST",
          path = "/v1/invoices/{invoice}/lines/{line_item_id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "LineItem",
              mode = SdkResponseMode.BUFFERED,
              id = "PostInvoicesInvoiceLinesLineItemId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostInvoicesInvoiceLinesLineItemId.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
          safety = OperationSafety(safe = false, idempotent = false),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = false,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val postInvoicesInvoiceMarkUncollectibleMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostInvoicesInvoiceMarkUncollectible",
          method = "POST",
          path = "/v1/invoices/{invoice}/mark_uncollectible",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Invoice",
              mode = SdkResponseMode.BUFFERED,
              id = "PostInvoicesInvoiceMarkUncollectible.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostInvoicesInvoiceMarkUncollectible.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
          safety = OperationSafety(safe = false, idempotent = false),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = false,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val postInvoicesInvoiceRemoveLinesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostInvoicesInvoiceRemoveLines",
          method = "POST",
          path = "/v1/invoices/{invoice}/remove_lines",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Invoice",
              mode = SdkResponseMode.BUFFERED,
              id = "PostInvoicesInvoiceRemoveLines.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostInvoicesInvoiceRemoveLines.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
          safety = OperationSafety(safe = false, idempotent = false),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = false,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val postInvoicesInvoiceSendMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostInvoicesInvoiceSend",
          method = "POST",
          path = "/v1/invoices/{invoice}/send",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Invoice",
              mode = SdkResponseMode.BUFFERED,
              id = "PostInvoicesInvoiceSend.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostInvoicesInvoiceSend.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
          safety = OperationSafety(safe = false, idempotent = false),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = false,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val postInvoicesInvoiceUpdateLinesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostInvoicesInvoiceUpdateLines",
          method = "POST",
          path = "/v1/invoices/{invoice}/update_lines",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Invoice",
              mode = SdkResponseMode.BUFFERED,
              id = "PostInvoicesInvoiceUpdateLines.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostInvoicesInvoiceUpdateLines.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
          safety = OperationSafety(safe = false, idempotent = false),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = false,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val postInvoicesInvoiceVoidMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostInvoicesInvoiceVoid",
          method = "POST",
          path = "/v1/invoices/{invoice}/void",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Invoice",
              mode = SdkResponseMode.BUFFERED,
              id = "PostInvoicesInvoiceVoid.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostInvoicesInvoiceVoid.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
          safety = OperationSafety(safe = false, idempotent = false),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = false,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }
  }
}
